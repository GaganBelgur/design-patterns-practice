package com.gaganbelgur.com.gaganbelgur

class TechnicalSupportHandler: SupportHandler() {

    override fun handleRequest(requestType: SupportTypes) {
        println("Just for logging: Called TechnicalSupportHandler")
        if(requestType == SupportTypes.TechnicalSupport) println("Technical Support: Handling the requests")
        else nextSupportHandler.handleRequest(requestType)
    }
}