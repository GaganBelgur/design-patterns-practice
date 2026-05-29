package com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.PlayListIterator
import com.gaganbelgur.com.gaganbelgur.SpotifyPlaylist
import com.gaganbelgur.com.gaganbelgur.Video
import com.gaganbelgur.com.gaganbelgur.YoutubePlaylist

fun main() {
    val playList = SpotifyPlaylist()

    playList.addVideo(Video("AI"))
    playList.addVideo(Video("STAR"))

    for(video in playList.getVideos()) {
        println(video.title)
    }

    val youtubePlaylist = YoutubePlaylist()
    youtubePlaylist.addVideo(Video("STRA"))
    youtubePlaylist.addVideo(Video("TSAR"))
    youtubePlaylist.addVideo(Video("RAST"))
    youtubePlaylist.addVideo(Video("ARTS"))

    val iterator: PlayListIterator = youtubePlaylist.createIterator()
    while (iterator.hasNext()) {
        iterator.next()?.let {
            println(it.title)
        }
    }
}