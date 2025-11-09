package com.gaganbelgur.com.gaganbelgur.examples.secondexample.payments

import com.gaganbelgur.com.gaganbelgur.examples.secondexample.gateways.PaymentGateWay

class UPIPayment(gateWay: PaymentGateWay): Payment(gateWay) {

    override fun makePayment(orderId: String, amount: Double): String {
        println("Initiating UPI payment...")
        return gateWay.processPayment(orderId, amount)
    }
}