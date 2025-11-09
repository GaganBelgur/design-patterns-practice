package com.gaganbelgur.com.gaganbelgur.examples.secondexample.gateways

interface PaymentGateWay {
    fun processPayment(orderId: String, amount: Double): String
}