package com.gaganbelgur

fun main() {
    val areaVisitor: ShapeVisitor = AreaVisitor()

    val rectangle: Shape = RectangleShape(4.0, 6.0)
    rectangle.accept(areaVisitor)

    val square: Shape = SquareShape(5.0)
    square.accept(areaVisitor)
}