package com.gaganbelgur.refactored

class RemoteControl {
    private lateinit var command: Command

    fun setCommand(command: Command) {
        this.command = command
    }

    fun pressButton() = command.execute()
}