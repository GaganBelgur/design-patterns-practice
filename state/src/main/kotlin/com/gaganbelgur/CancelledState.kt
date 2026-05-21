package com.gaganbelgur.com.gaganbelgur

class CancelledState: OrderContext {

    private var orderContext: OrderContext = this

    override fun setState(orderContext: OrderContext) {
        this.orderContext = orderContext
    }

    override fun nextOrder() {
        println("Cancelled order cannot be moved to next state")
    }

    override fun cancelOrder() {
        println("Order is already cancelled")
    }

    override fun getState(): OrderContext = orderContext
}