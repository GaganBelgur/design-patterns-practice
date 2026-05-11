package com.gaganbelgur

class SquareShape(var side: Double) : Shape {
    override fun accept(visitor: ShapeVisitor) {
        visitor.visit(this)
    }
}
