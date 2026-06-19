package com.gaganbelgur.com.gaganbelgur.subscribers

import java.net.URL

fun interface Subscriber {
    fun update(video: URL)
}