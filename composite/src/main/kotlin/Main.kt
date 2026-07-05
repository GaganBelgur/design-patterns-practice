package com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.CartItem
import com.gaganbelgur.com.gaganbelgur.Product
import com.gaganbelgur.com.gaganbelgur.ProductBundle


fun main() {
    val book: CartItem = Product("Atomic Habits", 499.0)
    val phone: CartItem = Product("iPhone 15", 79999.0)
    val earbuds: CartItem = Product("AirPods", 15999.0)
    val charger: CartItem = Product("20W Charger", 1999.0)

    // Combo Deal
    val iphoneCombo = ProductBundle("iPhone Essentials Combo")
    iphoneCombo.addItem(phone)
    iphoneCombo.addItem(earbuds)
    iphoneCombo.addItem(charger)

    // Back to School Kit
    val schoolKit = ProductBundle("Back to School Kit")
    schoolKit.addItem(Product("Notebook Pack", 249.0))
    schoolKit.addItem(Product("Pen Set", 99.0))
    schoolKit.addItem(Product("Highlighter", 149.0))

    // Add everything to cart
    val cart: MutableList<CartItem> = ArrayList()
    cart.add(book)
    cart.add(iphoneCombo)
    cart.add(schoolKit)

    // Display cart
    println("Your Amazon Cart:")
    var total = 0.0
    for (item in cart) {
        item.display(" ")
        total += item.getPrice()
    }

    println("\nTotal: ₹$total")
}