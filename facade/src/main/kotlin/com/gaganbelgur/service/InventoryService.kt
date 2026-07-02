package com.gaganbelgur.com.gaganbelgur.service

fun interface InventoryService {
    fun updateInventory(productId: String, quantity: Int)
}