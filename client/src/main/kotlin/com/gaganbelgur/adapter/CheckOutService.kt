package com.gaganbelgur.adapter

import com.gaganbelgur.PaymentGateWay

class CheckOutService constructor(private val paymentGateWay: PaymentGateWay) {

    fun checkout(orderId: String, amount: Double): String {
        return paymentGateWay.processPayment(orderId, amount)
    }
}