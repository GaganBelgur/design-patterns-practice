package com.gaganbelgur

import src.main.java.com.gaganbelgur.GadgetType

fun main() {
    val laptop = GadgetType.LaptopType.create()
    laptop.powerOn()
    laptop.powerOff()
}