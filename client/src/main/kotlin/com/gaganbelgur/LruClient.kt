package com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.LRUCache
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val cache = LRUCache<String, String>(
            capacity = 2,
            ttlSeconds = 2
        )

        cache.put("A", "Technology")
        cache.put("B", "Software")
        println(cache.get("B"))
        delay(3000)
        println(cache.get("A"))

        cache.close()
    }
}