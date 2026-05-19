package com.gaganbelgur.com.gaganbelgur

abstract class Notification {

    fun send(to: String, message: String) {
        rateLimitCheck(to)
        validateRecipient(to)
        val formattedMessage = formatMessage(message)

        logMessage(formattedMessage)

        val composedMessage = composeMessage(formattedMessage)
        sendMessage(to, composedMessage)

        logMessage(composedMessage)
    }

    private fun rateLimitCheck(to: String) = println("Checking Rate Limits for: $to")


    private fun validateRecipient(to: String) = println("validating Recipient $to")


    private fun formatMessage(message: String) = message.trim()

    private fun logMessage(message: String) = println(message = message)

    abstract fun composeMessage(formattedMessage: String): String

    abstract fun sendMessage(to: String, composedMessage: String)
}