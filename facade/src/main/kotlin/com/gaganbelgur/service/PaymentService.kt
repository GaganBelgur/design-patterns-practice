package com.gaganbelgur.com.gaganbelgur.service

fun interface PaymentService {
    fun makePayment(accountID: String, amount: Double): Boolean
}