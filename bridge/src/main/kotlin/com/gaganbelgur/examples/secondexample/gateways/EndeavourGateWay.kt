package com.gaganbelgur.com.gaganbelgur.examples.secondexample.gateways

class EndeavourGateWay: PaymentGateWay {
    override fun processPayment(orderId: String, amount: Double): String {
        return "Processing payment of $$amount for order $orderId through Endeavour GateWay".also { println(it) }
    }
}