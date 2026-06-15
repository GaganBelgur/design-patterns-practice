package com.gaganbelgur.com.gaganbelgur

class MilkDecorator(private val coffee: Coffee): CoffeeDecorator(coffee) {

    override fun getDescription(): String = "${coffee.getDescription()}, Milk"

    override fun coffeeCost(): Double = coffee.coffeeCost() + 10.0
}