package com.gaganbelgur.com.gaganbelgur

class Product(private val name: String, private val price: Double): CartItem {
    override fun getPrice(): Double = price

    override fun display(string: String) = println("Product: $name, Price: $price")
}