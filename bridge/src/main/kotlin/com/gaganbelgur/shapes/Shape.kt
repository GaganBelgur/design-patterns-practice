package com.gaganbelgur.com.gaganbelgur.shapes

import com.gaganbelgur.com.gaganbelgur.colors.Color

abstract class Shape {
    protected val color: Color

    constructor(color: Color) {
        this.color = color
    }

    abstract fun draw(): String
}