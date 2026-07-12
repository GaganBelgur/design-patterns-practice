package com.gaganbelgur

class Tree(private val xCoordinate: Int, private val yCoordinate: Int, private val treeType: TreeType) {

    fun draw() {
        treeType.draw(xCoordinate, yCoordinate)
    }
}