package com.gaganbelgur

class TreeFactory {

    companion object {
        private val map = mutableMapOf<String, TreeType>()

        fun getTreeType(name: String, color: String): TreeType {
            val key = "$name-$color"
            return map.getOrPut(key) {
                TreeType(name, color)
            }
        }
    }
}