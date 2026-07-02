package com.gaganbelgur.com.gaganbelgur.serviceimpl

import com.gaganbelgur.com.gaganbelgur.service.InventoryService

class InventoryServiceImpl: InventoryService {
    override fun updateInventory(productId: String, quantity: Int) = println("Update inventory")
}