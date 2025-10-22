package com.gaganbelgur

interface PaymentGateWay {
    fun processPayment(orderId: String, amount: Double): String
}