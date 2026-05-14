package com.gaganbelgur.refactored

class AcTemperature {

    private var temp: Int = 0

    fun increase() {
        temp += 1;
        println(temp)
    }

    fun decrease() {
        temp -= 1;
        println(temp)
    }
}