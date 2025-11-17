package com.gaganbelgur.com.gaganbelgur

internal class Node<K, V> (
    val key: K? = null,
    var value: V? = null,
    var expiryTime: Long = System.currentTimeMillis()
) {
    var prev: Node<K, V>? = null
    var next: Node<K, V>? = null
}