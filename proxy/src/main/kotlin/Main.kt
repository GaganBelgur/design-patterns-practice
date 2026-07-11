package com.gaganbelgur

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val cachedVideoDownloader = CachedVideoDownloader()
    println("CachedVideoDownloader starting...")
    println("First video downloader starting...")
    cachedVideoDownloader.downloadVideo("https://www.youtube.com/abc")

    //Observe the logs
    println("Second time user downloads the same first video...")
    cachedVideoDownloader.downloadVideo("https://www.youtube.com/abc")
}