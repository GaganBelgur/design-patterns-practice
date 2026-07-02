package com.gaganbelgur.com.gaganbelgur.service

fun interface OrderService {
    fun placeOrder(accountId: String, amount: Double)
}