package com.gaganbelgur

fun interface VideoDownloader {
    fun downloadVideo(url: String): String
}