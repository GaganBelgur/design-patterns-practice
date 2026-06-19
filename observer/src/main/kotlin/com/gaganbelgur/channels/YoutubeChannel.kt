package com.gaganbelgur.com.gaganbelgur.channels

import com.gaganbelgur.com.gaganbelgur.subscribers.Subscriber
import java.net.URL

class YoutubeChannel(private val channelName: String): Channel {
    private val subscribers = arrayListOf<Subscriber>()

    override fun subscribe(subscriber: Subscriber) {
        subscribers.add(subscriber)
    }

    override fun unsubscribe(subscriber: Subscriber) {
        subscribers.remove(subscriber)
    }

    override fun notifySubscribers(video: URL) {
        subscribers.forEach { it.update(video) }
    }

    fun uploadVideo(video: URL) {
        println("Uploading video: $video in Channel: $channelName")
        notifySubscribers(video)
    }
}