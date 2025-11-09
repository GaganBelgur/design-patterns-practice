package com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.examples.firstexample.colors.BlueColor
import com.gaganbelgur.com.gaganbelgur.examples.firstexample.colors.WhiteColor
import com.gaganbelgur.com.gaganbelgur.examples.firstexample.shapes.CircleShape
import com.gaganbelgur.com.gaganbelgur.examples.firstexample.shapes.SquareShape

fun main() {
    val blueCircleShape = CircleShape(BlueColor())
    blueCircleShape.draw()

    val whiteSquareShape = SquareShape(WhiteColor())
    whiteSquareShape.draw()
}