package com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.*


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val supportService = SupportService()

    supportService.handleSupportRequest("delivery")
    supportService.handleSupportRequest("other")

    val general: SupportHandler = GeneralSupportHandler()
    val billing: SupportHandler = BillingSupportHandler()
    val technical: SupportHandler = TechnicalSupportHandler()
    val delivery: SupportHandler = DeliverySupportHandler()

    // Setting up the chain: general -> billing -> technical -> delivery
    general.setNextHandler(billing)
    billing.setNextHandler(technical)
    technical.setNextHandler(delivery)

    general.handleRequest(SupportTypes.TechnicalSupport)
}