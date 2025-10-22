package com.gaganbelgur.legacy

interface SBILegacyPaymentGateWayInterface {

    fun makePayment(orderId: String, amount: Double): Boolean
}