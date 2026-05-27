package com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.Video
import com.gaganbelgur.com.gaganbelgur.YoutubePlaylist

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val playList = YoutubePlaylist()

    playList.addVideo(Video("AI"))
    playList.addVideo(Video("STAR"))

    for(video in playList.getVideos()) {
        println(video.title)
    }

    //Step 1: Introduce the Iterator interface
}