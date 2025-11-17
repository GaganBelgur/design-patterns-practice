package com.gaganbelgur.com.gaganbelgur

import java.util.PriorityQueue
import java.util.concurrent.ConcurrentHashMap

class LRUCache<K: Any, V>(private val capacity: Int, ttlSeconds: Long) {

    private val ttlInMillis = ttlSeconds * 1000
    private val cache = ConcurrentHashMap<K, Node<K, V>>()
    private val expiryQueue = PriorityQueue<Node<K, V>>(compareBy { it.expiryTime })

    private val head = Node<K, V>()
    private val tail = Node<K, V>()

    init {
        head.next = tail
        tail.prev = head
    }
}