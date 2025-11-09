package com.gaganbelgur.com.gaganbelgur.examples.firstexample.shapes

import com.gaganbelgur.com.gaganbelgur.examples.firstexample.colors.Color

class SquareShape(color: Color): Shape(color) {

    override fun draw(): String {
        return "Drawing a Square with color: ${color.fill()}".also { println(it) }
    }
}