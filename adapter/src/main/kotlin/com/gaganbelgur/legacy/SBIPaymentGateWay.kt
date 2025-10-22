package com.gaganbelgur.legacy

internal class SBIPaymentGateWay: SBILegacyPaymentGateWayInterface {

    override fun makePayment(orderId: String, amount: Double): Boolean {
        println("Processing payment of $$amount for order $orderId through SBI Legacy Payment Gateway.")
        // Simulate payment processing logic
        println("Payment processed successfully through SBI Legacy Gateway.")
        return true
    }
}