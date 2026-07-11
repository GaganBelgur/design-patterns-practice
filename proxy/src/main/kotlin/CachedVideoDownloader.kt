package com.gaganbelgur

class CachedVideoDownloader : VideoDownloader {

    private val realVideoDownloader = RealVideoDownloader()
    private val cache = mutableMapOf<String, String>()

    override fun downloadVideo(url: String): String {
        cache[url]?.let {
            println("Returning cached video for $url")
            return it
        }

        println("Cache entry doesnt exist Downloading for $url")
        val video = realVideoDownloader.downloadVideo(url)
        cache[url] = video
        return video
    }
}