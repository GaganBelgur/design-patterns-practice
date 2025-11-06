package com.gaganbelgur.com.gaganbelgur.colors

class WhiteColor: Color {
    override fun fill(): String {
        return "Filling with White Color".also { println(it) }
    }
}