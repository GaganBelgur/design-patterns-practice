package com.gaganbelgur.com.gaganbelgur

class SupportService {

    fun handleSupportRequest(requestType: String) {
        val handledBy = when(requestType) {
            "general" -> "Will be taken care by General Support Team"
            "refund" -> "Will be taken care by Refund Support Team"
            "technical" -> "Will be taken care by Technical Support Team"
            "delivery" -> "Will be taken care by Delivery Support Team"
            else -> "No Support Team to handle"
        }

        println("$requestType : $handledBy")
    }
}