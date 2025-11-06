package com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.colors.BlueColor
import com.gaganbelgur.com.gaganbelgur.colors.WhiteColor
import com.gaganbelgur.com.gaganbelgur.shapes.CircleShape
import com.gaganbelgur.com.gaganbelgur.shapes.SquareShape

fun main() {
    val blueCircleShape = CircleShape(BlueColor())
    blueCircleShape.draw()

    val whiteSquareShape = SquareShape(WhiteColor())
    whiteSquareShape.draw()
}