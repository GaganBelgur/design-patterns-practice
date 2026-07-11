package com.gaganbelgur

class RealVideoDownloader: VideoDownloader {
    override fun downloadVideo(url: String): String {
        val downloadResult = "Video downloaded from $url"
        println("Downloading video from $url")
        return downloadResult
    }
}