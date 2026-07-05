package com.gaganbelgur.com.gaganbelgur

class ProductBundle(private val name: String): CartItem {
    private val items: MutableList<CartItem> = mutableListOf()

    fun addItem(item: CartItem) {
        items.add(item)
    }

    override fun getPrice(): Double {
        return items.sumOf { it.getPrice() }
    }

    override fun display(string: String) {
        println("Product Bundle: $name, Total Price: ${getPrice()}")
        items.forEach { it.display("  ") }
    }
}