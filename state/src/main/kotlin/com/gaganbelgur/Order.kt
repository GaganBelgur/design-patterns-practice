package com.gaganbelgur.com.gaganbelgur

/*
Issues In The Code

1. State Transition Management:
The state transitions are hardcoded in the progressToNextState() method using a switch statement.
This approach becomes cumbersome if new states need to be added.

2. Lack of Encapsulation:
The state transition logic and cancel behavior are directly handled within the Order class.
This violates the Single Responsibility Principle by combining multiple responsibilities within a single class.

3. Code Duplication:
The logic for the cancelOrder() and progressToNextState() methods could
lead to duplicate logic if more states and actions are added.

4. Missing Flexibility for Future Changes:
Adding new states or changing existing behaviors can be
error-prone and cumbersome, as the Order class needs to be updated each time.
*/
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
        orderState = when (orderState) {
            "ORDER_PLACED" -> {
                "PREPARING"
            }
            "PREPARING" -> {
                "OUT_FOR_DELIVERY"
            }
            "OUT_FOR_DELIVERY" -> {
                "DELIVERED"
            }
            else -> {
                println("End of State")
                return
            }
        }
    }
}