package com.gaganbelgur

class AreaVisitor : ShapeVisitor {
    override fun visit(rectangleShape: RectangleShape) {
        val result = rectangleShape.length * rectangleShape.width
        println(result)
    }

    override fun visit(squareShape: SquareShape) {
        val result = squareShape.side * squareShape.side
        println(result)
    }
}
