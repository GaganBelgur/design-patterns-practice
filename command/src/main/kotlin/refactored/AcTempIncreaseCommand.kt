package com.gaganbelgur.refactored

class AcTempIncreaseCommand(private val acTemperature: AcTemperature): Command {

    override fun execute() = acTemperature.increase()

}