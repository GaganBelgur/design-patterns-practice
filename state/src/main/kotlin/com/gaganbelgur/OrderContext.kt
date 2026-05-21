package com.gaganbelgur.com.gaganbelgur

interface OrderContext {

    fun setState(orderContext: OrderContext)
    fun nextOrder()
    fun cancelOrder()
    fun getState(): OrderContext
}