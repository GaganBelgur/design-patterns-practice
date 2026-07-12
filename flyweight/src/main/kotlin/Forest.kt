package com.gaganbelgur

class Forest {
    private val list = mutableListOf<Tree>()

    fun addTree(xCoordinate: Int, yCoordinate: Int, name: String, color: String) {
        val treeType: TreeType = TreeFactory.getTreeType(name, color)
        val tree = Tree(xCoordinate, yCoordinate, treeType)
        list.add(tree)
    }

    fun plantTree() {
        list.forEach {
            it.draw()
        }
    }
}