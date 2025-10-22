package com.gaganbelgur

class CitiPaymentGateWay : PaymentGateWay {
    override fun processPayment(orderId: String, amount: Double): String {
        println("Processing payment of $$amount for order $orderId through Citi Payment Gateway.")
        // Simulate payment processing logic
        val transactionId = "CITI${System.currentTimeMillis()}"
        println("Payment processed successfully. Transaction ID: $transactionId")
        return transactionId
    }
}