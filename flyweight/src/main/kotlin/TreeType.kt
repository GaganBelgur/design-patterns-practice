package com.gaganbelgur

class TreeType(private val name: String, private val color: String) {

    fun draw(xCoordinate: Int, yCoordinate: Int) {
        println("Drawing $name at ($xCoordinate, $yCoordinate) with color $color")
    }
}