package com.gaganbelgur

import src.main.java.com.gaganbelgur.GadgetType

fun main() {
    val laptop = GadgetType.LaptopType.create()
    laptop.powerOn()
    laptop.powerOff()

    val desktop = GadgetType.DesktopType.create()
    desktop.powerOn()
    desktop.powerOff()

    val smartWatch = GadgetType.SmartWatchType.create()
    smartWatch.powerOn()
    smartWatch.powerOff()

    val fitnessWatch = GadgetType.FitnessWatchType.create()
    fitnessWatch.powerOn()
    fitnessWatch.powerOff()

}