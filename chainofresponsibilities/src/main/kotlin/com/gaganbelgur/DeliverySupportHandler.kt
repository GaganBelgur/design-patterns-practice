package com.gaganbelgur.com.gaganbelgur

class DeliverySupportHandler: SupportHandler() {

    override fun handleRequest(requestType: SupportTypes) {
        println("Just for logging: Called DeliverySupportHandler")
        if(requestType == SupportTypes.DeliverySupport) println("Delivery Support: Handling the requests")
        else nextSupportHandler.handleRequest(requestType)
    }
}