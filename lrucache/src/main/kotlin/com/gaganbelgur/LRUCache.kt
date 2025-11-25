package com.gaganbelgur.com.gaganbelgur

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.supervisorScope
import java.util.PriorityQueue
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

class LRUCache<K : Any, V>(private val capacity: Int, ttlSeconds: Long) {

    private val ttlInMillis = ttlSeconds * 1000
    private val cache = ConcurrentHashMap<K, Node<K, V>>()
    private val expiryQueue = PriorityQueue<Node<K, V>>(compareBy { it.expiryTime })

    private val head = Node<K, V>()
    private val tail = Node<K, V>()

    private val locker = ReentrantLock()
    private val cleanerJob: Job
    private val scope = CoroutineScope(Dispatchers.IO + SupervisorJob())

    init {
        head.next = tail
        tail.prev = head

        cleanerJob = scope.launch {
            while (isActive) {
                try {
                    evictExpired()
                    delay(1000)
                } catch (exception: Exception) {
                    break
                }
            }
        }
    }

    private fun evictExpired() {
        val now = System.currentTimeMillis()
        locker.withLock {
            while (expiryQueue.isNotEmpty() && expiryQueue.peek().expiryTime <= now) {
                val expired = expiryQueue.poll()
                expired.key?.let {
                    cache.remove(it)
                }
                removeNode(expired)
            }
        }
    }

    fun close() {
        cleanerJob.cancel()
    }

    fun get(key: K): V? {
        val node = cache[key] ?: return null
        if (isExpired(node)) {
            remove(node)
            return null
        }

        moveToHead(node)
        return node.value
    }

    fun put(key: K, value: V) {
        val expiry: Long = System.currentTimeMillis() + ttlInMillis
        val existingNode = cache[key]

        if (existingNode != null) {
            locker.withLock {
                existingNode.value = value
                existingNode.expiryTime = expiry
                expiryQueue.remove(existingNode)
                expiryQueue.offer(existingNode)
                moveToHeadSynchronized(existingNode)
            }
            return
        }

        val newNode = Node(key, value, expiry)
        cache[key] = newNode

        locker.withLock {
            addToHead(newNode)
            expiryQueue.offer(newNode)

            if (cache.size > capacity) {
                tail.prev?.let { leastRecentlyUsed ->
                    remove(leastRecentlyUsed)
                }
            }
        }
    }

    private fun moveToHead(node: Node<K, V>) {
        locker.withLock {
            moveToHeadSynchronized(node)
        }
    }

    private fun moveToHeadSynchronized(node: Node<K, V>) {
        removeNode(node)
        addToHead(node)
    }

    private fun addToHead(node: Node<K, V>) {
        node.next = head.next
        node.prev = head

        head.next?.prev = node
        head.next = node
    }

    private fun remove(node: Node<K, V>) {
        locker.withLock {
            cache.remove(node.key)
            expiryQueue.remove(node)
            removeNode(node)
        }
    }

    private fun removeNode(node: Node<K, V>) {
        node.prev?.next = node.next
        node.next?.prev = node.prev
    }

    private fun isExpired(node: Node<K, V>): Boolean {
        return System.currentTimeMillis() > node.expiryTime
    }
}