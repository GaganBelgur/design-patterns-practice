package com.gaganbelgur.com.gaganbelgur.examples.secondexample.payments

import com.gaganbelgur.com.gaganbelgur.examples.secondexample.gateways.PaymentGateWay

abstract class Payment(val gateWay: PaymentGateWay) {

    abstract fun makePayment(orderId: String, amount: Double): String

}