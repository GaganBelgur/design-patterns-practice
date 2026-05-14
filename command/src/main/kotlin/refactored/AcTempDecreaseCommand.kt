package com.gaganbelgur.refactored

class AcTempDecreaseCommand(private val acTemperature: AcTemperature): Command {

    override fun execute() = acTemperature.decrease()

}