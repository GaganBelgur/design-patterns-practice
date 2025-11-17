package com.gaganbelgur.com.gaganbelgur

import java.util.PriorityQueue
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.locks.ReentrantLock

class LRUCache<K: Any, V>(private val capacity: Int, ttlSeconds: Long) {

    private val ttlInMillis = ttlSeconds * 1000
    private val cache = ConcurrentHashMap<K, Node<K, V>>()
    private val expiryQueue = PriorityQueue<Node<K, V>>(compareBy { it.expiryTime })

    private val head = Node<K, V>()
    private val tail = Node<K, V>()

    private val locker = ReentrantLock()

    init {
        head.next = tail
        tail.prev = head
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

    private fun moveToHead(node: Node<K, V>) {
        locker.lock()
        try {
            moveToHeadSynchronized(node)
        }
        finally {
            locker.unlock()
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
        locker.lock()
        try {
            cache.remove(node.key)
            expiryQueue.remove(node)
            removeNode(node)
        }
        finally {
            locker.unlock()
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