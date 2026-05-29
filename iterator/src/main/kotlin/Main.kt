package com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.SpotifyPlaylist
import com.gaganbelgur.com.gaganbelgur.Video

fun main() {
    val playList = SpotifyPlaylist()

    playList.addVideo(Video("AI"))
    playList.addVideo(Video("STAR"))

    for(video in playList.getVideos()) {
        println(video.title)
    }

    //Step 1: Introduce the Iterator interface
}