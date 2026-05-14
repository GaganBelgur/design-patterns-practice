package com.gaganbelgur.refactored

import com.gaganbelgur.noncommand.Light

class LightOnCommand(private val light: Light): Command {
    override fun execute() = light.on()
}