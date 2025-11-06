package com.gaganbelgur.com.gaganbelgur.shapes

import com.gaganbelgur.com.gaganbelgur.colors.Color

class SquareShape(color: Color): Shape(color) {

    override fun draw(): String {
        return "Drawing a Square with color: ${color.fill()}".also { println(it) }
    }
}