package com.gaganbelgur.com.gaganbelgur.serviceimpl

import com.gaganbelgur.com.gaganbelgur.service.PaymentService

class PaymentServiceImpl : PaymentService {
    override fun makePayment(accountID: String, amount: Double): Boolean =
        println("Payment of $amount successful for account $accountID").let { true }
}