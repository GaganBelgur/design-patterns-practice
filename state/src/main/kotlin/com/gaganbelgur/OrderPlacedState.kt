package com.gaganbelgur.com.gaganbelgur

class OrderPlacedState: OrderContext {

    private var orderContext: OrderContext = this

    override fun setState(orderContext: OrderContext) {
        this.orderContext = orderContext
    }

    override fun nextOrder() {
       setState(PreparedState())
    }

    override fun cancelOrder() {
        setState(CancelledState())
    }

    override fun getState(): OrderContext = orderContext
}