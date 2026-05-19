package com.gaganbelgur.com.gaganbelgur

class EmailNotification: Notification() {

    override fun composeMessage(formattedMessage: String): String =
        "<html><body><p>$formattedMessage</p></body></html>";

    override fun sendMessage(to: String, composedMessage: String) = println("Sending Email to = $to with the message $composedMessage")
}