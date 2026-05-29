package com.gaganbelgur.com.gaganbelgur
/*
Issues with this code

1. Exposes the internal structure
2. Tight coupling with underlying data structure
3. No control over traversal
4. Difficult to support multiple independent traversals
*/
class SpotifyPlaylist {
    private val videos = mutableListOf<Video>()

    fun addVideo(video: Video) = videos.add(video)

    fun getVideos() = videos
}