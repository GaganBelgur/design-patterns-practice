package com.gaganbelgur.com.gaganbelgur

import kotlinx.coroutines.*
import java.lang.AutoCloseable
import java.util.*
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds

class LRUCache<K : Any, V : Any>(
    private val capacity: Int,
    ttlSeconds: Long,
    cleanerIntervalMillis: Duration = 1000.milliseconds
): AutoCloseable {

    private val ttlInMillis = ttlSeconds * 1000
    private val cache: ConcurrentHashMap<K, Node<K, V>> = ConcurrentHashMap()
    private val expiryQueue = PriorityQueue<Node<K, V>>(compareBy { it.expiryTime })

    private val head = Node<K, V>()
    private val tail = Node<K, V>()

    private val locker = ReentrantLock()
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    private val cleanerJob: Job

    init {
        head.next = tail
        tail.prev = head

        cleanerJob = startCleaner(cleanerIntervalMillis)
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

    private fun startCleaner(cleanerInterval: Duration): Job {
        return scope.launch {
            while (isActive) {
                try {
                    evictExpired()
                    delay(cleanerInterval)
                } catch (exception: Exception) {
                    println(exception.message)
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

    override fun close() {
        cleanerJob.cancel()
        runBlocking {
            cleanerJob.join()
        }
        scope.cancel()
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