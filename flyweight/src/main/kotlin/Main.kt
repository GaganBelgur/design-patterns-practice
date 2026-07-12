package com.gaganbelgur

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   val forest = Forest()

    // Create 1000 trees with random coordinates and types
    for (i in 1..1000) {
        val xCoordinate = (0..100).random()
        val yCoordinate = (0..100).random()
        forest.addTree(xCoordinate, yCoordinate, "TreeType${(1..5).random()}", "Color${(1..3).random()}")
    }

    // Draw all trees in the forest
    forest.plantTree()
}