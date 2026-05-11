package com.gaganbelgur

interface ShapeVisitor {
    fun visit(rectangleShape: RectangleShape)
    fun visit(squareShape: SquareShape)
}
