package com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.AirportQueueMatchingStrategy
import com.gaganbelgur.com.gaganbelgur.NearestMatchingStrategy
import com.gaganbelgur.com.gaganbelgur.RideMatchingService

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val nearestMatchingStrategy = NearestMatchingStrategy()

    val matchingService = RideMatchingService(nearestMatchingStrategy)
    matchingService.match("JP Nagar")

    matchingService.setStrategy(AirportQueueMatchingStrategy())
    matchingService.match("Airport")
}