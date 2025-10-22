package com.gaganbelgur

class HDFCPaymentGateWay: PaymentGateWay {

    override fun processPayment(orderId: String, amount: Double): String {
        println("Processing payment of $$amount for order $orderId through HDFC Payment Gateway.")
        // Simulate payment processing logic
        val transactionId = "HDFC${System.currentTimeMillis()}"
        println("Payment processed successfully. Transaction ID: $transactionId")
        return transactionId
    }
}