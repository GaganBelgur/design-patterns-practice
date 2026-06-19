package com.gaganbelgur.com.gaganbelgur.subscribers

import java.net.URL

class EmailSubscriber(private val channelName: String): Subscriber {
    override fun update(video: URL) {
        println("Email Subscriber: New video uploaded on $channelName: $video")
    }
}