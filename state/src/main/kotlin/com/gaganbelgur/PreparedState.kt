package com.gaganbelgur.com.gaganbelgur

class PreparedState: OrderContext {

    private var orderContext: OrderContext = this

    override fun setState(orderContext: OrderContext) {
        this.orderContext = orderContext
    }

    override fun nextOrder() = setState(OutForDeliveryState())

    override fun cancelOrder() = setState(CancelledState())

    override fun getState(): OrderContext = orderContext
}