package com.gaganbelgur.com.gaganbelgur.channels

import com.gaganbelgur.com.gaganbelgur.subscribers.Subscriber
import java.net.URL

interface Channel {

    fun subscribe(subscriber: Subscriber)

    fun unsubscribe(subscriber: Subscriber)

    fun notifySubscribers(video: URL)
}