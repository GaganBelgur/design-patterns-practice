package com.gaganbelgur.com.gaganbelgur.subscribers

import java.net.URL

class MobileSubscriber(private val channelName: String): Subscriber {
    override fun update(video: URL) {
        println("Mobile Subscriber: New video uploaded on $channelName: $video")
    }
}