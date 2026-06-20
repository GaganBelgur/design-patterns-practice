package com.gaganbelgur.com.gaganbelgur

class AirportQueueMatchingStrategy: MatchingStrategy {
    override fun match(location: String) {
        println("Airport Queue Matching Strategy $location")
    }
}