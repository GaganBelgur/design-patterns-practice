package com.gaganbelgur.com.gaganbelgur

class SugarDecorator(private val coffee: Coffee): CoffeeDecorator(coffee) {

    override fun getDescription(): String = "${coffee.getDescription()}, Sugar"

    override fun coffeeCost(): Double = coffee.coffeeCost() + 5.0
}