package com.gaganbelgur.com.gaganbelgur.examples.firstexample.shapes

import com.gaganbelgur.com.gaganbelgur.examples.firstexample.colors.Color

class CircleShape (color: Color): Shape(color) {

    override fun draw(): String {
        return "Drawing a Circle with color: ${color.fill()}".also { println(it) }
    }
}