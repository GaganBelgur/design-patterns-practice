package com.gaganbelgur.com.gaganbelgur

abstract class User {
    protected var chatMediator: ChatMediator
    protected var name: String

    constructor(chatMediator: ChatMediator, name: String) {
        this.chatMediator = chatMediator
        this.name = name
    }

    abstract fun send(message: String)
    abstract fun receive(message: String)
}