package com.gaganbelgur.com.gaganbelgur.serviceimpl

import com.gaganbelgur.com.gaganbelgur.service.OrderService

class OrderServiceImpl: OrderService {
    override fun placeOrder(accountId: String, amount: Double) = println("Place order")
}