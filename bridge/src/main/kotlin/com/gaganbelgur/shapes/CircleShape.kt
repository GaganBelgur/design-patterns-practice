package com.gaganbelgur.com.gaganbelgur.shapes

import com.gaganbelgur.com.gaganbelgur.colors.Color

class CircleShape (color: Color): Shape(color) {

    override fun draw(): String {
        return "Drawing a Circle with color: ${color.fill()}".also { println(it) }
    }
}