package com.gaganbelgur.com.gaganbelgur.examples.firstexample.colors

class WhiteColor: Color {
    override fun fill(): String {
        return "Filling with White Color".also { println(it) }
    }
}