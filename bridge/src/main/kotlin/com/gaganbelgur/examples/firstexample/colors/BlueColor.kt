package com.gaganbelgur.com.gaganbelgur.examples.firstexample.colors

class BlueColor: Color {
    override fun fill(): String {
        return "Filling with Blue Color".also { println(it) }
    }
}