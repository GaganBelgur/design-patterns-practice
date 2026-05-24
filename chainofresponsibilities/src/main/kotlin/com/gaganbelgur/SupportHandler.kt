package com.gaganbelgur.com.gaganbelgur

abstract class SupportHandler {

    protected lateinit var nextSupportHandler: SupportHandler

    fun setNextHandler(nextSupportHandler: SupportHandler) {
        this.nextSupportHandler = nextSupportHandler
    }

    abstract fun handleRequest(requestType: SupportTypes)
}