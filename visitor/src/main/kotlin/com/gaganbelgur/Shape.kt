package com.gaganbelgur

interface Shape {
    fun accept(visitor: ShapeVisitor)
}
