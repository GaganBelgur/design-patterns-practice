package com.gaganbelgur

class RectangleShape(var width: Double, var length: Double) : Shape {
    override fun accept(visitor: ShapeVisitor) {
        visitor.visit(this)
    }
}
