package com.gaganbelgur.legacy

import com.gaganbelgur.PaymentGateWay

class SBIPaymentGateWayAdapter: PaymentGateWay {

    private val sbiPaymentGateWay: SBIPaymentGateWay = SBIPaymentGateWay()

    override fun processPayment(orderId: String, amount: Double): String {
        val isSuccess = sbiPaymentGateWay.makePayment(orderId, amount)

        return if (isSuccess) {
            "Payment of $$amount for order $orderId processed successfully through SBI Payment Gateway."
        } else {
            "Payment of $$amount for order $orderId failed through SBI Payment Gateway."
        }
    }
}