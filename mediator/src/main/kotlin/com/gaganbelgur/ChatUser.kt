package com.gaganbelgur.com.gaganbelgur

class ChatUser(chatMediator: ChatMediator, name: String): User(chatMediator, name) {

    override fun send(message: String) {
        println("$name sends the message $message")
        chatMediator.sendMessage(message, this)
    }

    override fun receive(message: String) = println("$name received the message $message")

}