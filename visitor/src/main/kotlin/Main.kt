package com.gaganbelgur

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val areaVisitor: ShapeVisitor = AreaVisitor()

    val rectangle: Shape = RectangleShape(4.0, 6.0)
    rectangle.accept(areaVisitor)

    val square: Shape = SquareShape(5.0)
    square.accept(areaVisitor)
}