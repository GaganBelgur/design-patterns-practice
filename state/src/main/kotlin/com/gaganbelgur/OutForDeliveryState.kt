package com.gaganbelgur.com.gaganbelgur

class OutForDeliveryState: OrderContext {

    private var orderContext: OrderContext = this

    override fun setState(orderContext: OrderContext) {
        this.orderContext = orderContext
    }

    override fun nextOrder() = setState(DeliveredState())

    override fun cancelOrder() = println("Cannot cancel. Order is out for delivery.")

    override fun getState(): OrderContext = orderContext
}