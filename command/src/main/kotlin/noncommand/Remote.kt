package com.gaganbelgur.noncommand

//Remote tightly coupled to Light
//Adding Fan, TV, AC becomes messy
class Remote(val light: Light) {

    fun turnOn() = light.on()

    fun turnOff() = light.off()
}