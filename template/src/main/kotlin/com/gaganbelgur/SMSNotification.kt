package com.gaganbelgur.com.gaganbelgur

class SMSNotification: Notification() {

    override fun composeMessage(formattedMessage: String): String = "[SMS] $formattedMessage";

    override fun sendMessage(to: String, composedMessage: String) = println("Sending SMS to = $to with the message $composedMessage")
}