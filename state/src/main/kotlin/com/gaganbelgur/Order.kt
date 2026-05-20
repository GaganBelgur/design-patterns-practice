package com.gaganbelgur.com.gaganbelgur

class Order(private var orderState: String = "ORDER_PLACED") {

    fun getState() = orderState

    fun cancelOrder() {
        if(orderState == "ORDER_PLACED" || orderState == "PREPARING") {
            orderState = "CANCELLED"
        } else {
            println("Order cannot be cancelled")
        }
    }

    fun progressToNextState() {
        if (orderState == "ORDER_PLACED") {
            orderState = "PREPARING"
        } else if (orderState == "PREPARING") {
            orderState = "OUT_FOR_DELIVERY"
        } else if (orderState == "OUT_FOR_DELIVERY") {
            orderState = "DELIVERED"
        } else {
            println("End of State")
            return
        }
    }


}