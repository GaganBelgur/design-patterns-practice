package com.gaganbelgur.com.gaganbelgur.examples.firstexample.shapes

import com.gaganbelgur.com.gaganbelgur.examples.firstexample.colors.Color

abstract class Shape {
    protected val color: Color

    constructor(color: Color) {
        this.color = color
    }

    abstract fun draw(): String
}