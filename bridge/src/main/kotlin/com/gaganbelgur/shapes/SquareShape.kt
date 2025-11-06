package com.gaganbelgur.com.gaganbelgur.shapes

import com.gaganbelgur.com.gaganbelgur.colors.Color

class SquareShape(color: Color): Shape(color) {

    override fun draw(): String {
        color.fill()
        return "Drawing a Square with color: ${color.fill()}"
    }
}