package com.gaganbelgur.com.gaganbelgur.examples.secondexample

interface PaymentGateWay {
    fun processPayment(orderId: String, amount: Double): String
}