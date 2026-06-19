package com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.channels.YoutubeChannel
import com.gaganbelgur.com.gaganbelgur.subscribers.EmailSubscriber
import com.gaganbelgur.com.gaganbelgur.subscribers.MobileSubscriber
import java.net.URL

fun main() {
    val channel = YoutubeChannel("Tech Tutorials")

    val mobileSubscriber = MobileSubscriber("Tech Tutorials")
    val emailSubscriber = EmailSubscriber("Tech Tutorials")

    channel.subscribe(mobileSubscriber)
    channel.subscribe(emailSubscriber)

    channel.uploadVideo(URL("https://www.youtube.com/watch?v=12345"))
}