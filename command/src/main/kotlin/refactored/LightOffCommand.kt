package com.gaganbelgur.refactored

import com.gaganbelgur.noncommand.Light

class LightOffCommand(private val light: Light): Command {
    override fun execute() = light.off()
}