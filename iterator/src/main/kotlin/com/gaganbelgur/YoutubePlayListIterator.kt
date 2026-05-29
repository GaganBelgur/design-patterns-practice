package com.gaganbelgur.com.gaganbelgur

class YoutubePlayListIterator( private val videos:List<Video>): PlayListIterator {
    private var position: Int = 0

    override fun hasNext(): Boolean = position < videos.size

    override fun next(): Video? = if(hasNext()) videos[position++] else null
}