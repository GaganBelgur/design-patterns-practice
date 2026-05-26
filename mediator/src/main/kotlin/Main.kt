package com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.ChatRoom
import com.gaganbelgur.com.gaganbelgur.ChatUser
import com.gaganbelgur.com.gaganbelgur.User

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val mediator = ChatRoom()

    val user1: User = ChatUser(mediator, "Gagan")
    val user2: User = ChatUser(mediator, "Spoorthi")
    val user3: User = ChatUser(mediator, "Aarav")

    mediator.adduser(user1)
    mediator.adduser(user2)
    mediator.adduser(user3)

    user1.send("Hi")
}