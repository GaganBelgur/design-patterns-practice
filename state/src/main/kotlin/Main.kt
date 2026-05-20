package com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.Order

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val order = Order()
    println(order.getState())
    order.progressToNextState()
    println(order.getState())
}