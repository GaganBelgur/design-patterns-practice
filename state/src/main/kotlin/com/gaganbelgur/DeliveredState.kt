package com.gaganbelgur.com.gaganbelgur

class DeliveredState: OrderContext {

    private var orderContext: OrderContext = this

    override fun setState(orderContext: OrderContext) {
        this.orderContext = orderContext
    }

    override fun nextOrder() = println("Order is already delivered.")

    override fun cancelOrder() = println("Cannot cancel a delivered order.")

    override fun getState(): OrderContext = orderContext
}