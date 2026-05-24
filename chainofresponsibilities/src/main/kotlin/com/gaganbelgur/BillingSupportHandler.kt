package com.gaganbelgur.com.gaganbelgur

class BillingSupportHandler: SupportHandler() {

    override fun handleRequest(requestType: SupportTypes) {
        println("Just for logging: Called BillingSupportHandler")
        if(requestType == SupportTypes.BillingSupport) println("Billing Support: Handling the requests")
        else nextSupportHandler.handleRequest(requestType)
    }
}