package com.gaganbelgur.com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.serviceimpl.InventoryServiceImpl
import com.gaganbelgur.com.gaganbelgur.serviceimpl.NotificationServiceImpl
import com.gaganbelgur.com.gaganbelgur.serviceimpl.OrderServiceImpl
import com.gaganbelgur.com.gaganbelgur.serviceimpl.PaymentServiceImpl

class BookingFacade {
    private val orderService = OrderServiceImpl()
    private val paymentService = PaymentServiceImpl()
    private val notificationService = NotificationServiceImpl()
    private val inventoryService = InventoryServiceImpl()

    fun book(accountID: String, amount: Double, productId: String, msg: String, quantity: Int) {
        paymentService.makePayment(accountID, amount)
        orderService.placeOrder(accountID, amount)
        inventoryService.updateInventory(productId, quantity)
        notificationService.send(msg)

        println("Booking completed for account $accountID with productId $productId and quantity $quantity total $amount")
    }
}