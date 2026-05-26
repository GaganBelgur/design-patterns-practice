package com.gaganbelgur.com.gaganbelgur

class ChatRoom : ChatMediator {

    private val userList: MutableList<User> = mutableListOf()

    fun adduser(user: User) {
        userList.add(user)
    }

    override fun sendMessage(msg: String, sender: User) = userList.forEach { user ->
        if (user != sender) user.receive(msg)
    }

}