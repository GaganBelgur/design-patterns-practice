package com.gaganbelgur.com.gaganbelgur

class ChocolateDecorator(private val coffee: Coffee): CoffeeDecorator(coffee) {

    override fun getDescription(): String = "${coffee.getDescription()}, Chocolate"

    override fun coffeeCost(): Double = coffee.coffeeCost() + 5.0
}