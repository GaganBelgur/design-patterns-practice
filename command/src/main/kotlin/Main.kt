package com.gaganbelgur

import com.gaganbelgur.noncommand.Light
import com.gaganbelgur.refactored.AcTempDecreaseCommand
import com.gaganbelgur.refactored.AcTempIncreaseCommand
import com.gaganbelgur.refactored.AcTemperature
import com.gaganbelgur.refactored.Command
import com.gaganbelgur.refactored.LightOffCommand
import com.gaganbelgur.refactored.LightOnCommand
import com.gaganbelgur.refactored.RemoteControl

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val light = Light()
    val remoteControl = RemoteControl()

    val lightOnCommand = LightOnCommand(light)
    val lightOffCommand = LightOffCommand(light)

    performAction(remoteControl, lightOnCommand)
    performAction(remoteControl, lightOffCommand)

    val acTemperature = AcTemperature()

    val increaseAcTemperature = AcTempIncreaseCommand(acTemperature)
    val decreaseAcTemperature = AcTempDecreaseCommand(acTemperature)

    performAction(remoteControl, increaseAcTemperature)
    performAction(remoteControl, decreaseAcTemperature)
}

fun performAction(remoteControl: RemoteControl, command: Command) {
    remoteControl.setCommand(command)
    remoteControl.pressButton()
}