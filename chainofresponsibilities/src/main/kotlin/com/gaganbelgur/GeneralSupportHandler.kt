package com.gaganbelgur.com.gaganbelgur

class GeneralSupportHandler: SupportHandler() {

    override fun handleRequest(requestType: SupportTypes) {
        println("Just for logging: Called GeneralSupportHandler")
        if(requestType == SupportTypes.DeliverySupport) println("General Support: Handling the requests")
        else nextSupportHandler.handleRequest(requestType)
    }
}