package com.gaganbelgur.com.gaganbelgur.examples.secondexample

class PulseGateWay: PaymentGateWay {
    override fun processPayment(orderId: String, amount: Double): String {
        return "Processing payment of $$amount for order $orderId through Pulse GateWay".also { println(it) }
    }
}