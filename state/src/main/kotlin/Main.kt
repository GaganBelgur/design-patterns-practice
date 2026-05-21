package com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.Order
import com.gaganbelgur.com.gaganbelgur.OrderPlacedState

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val order = Order()
    println(order.getState())
    order.progressToNextState()
    println(order.getState())
    order.cancelOrder()
    println(order.getState())

    println("Post Implementing the Stateful Objects")
    val orderContext = OrderPlacedState()
    orderContext.nextOrder()
    println(orderContext.getState())
}