package com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.ChocolateDecorator
import com.gaganbelgur.com.gaganbelgur.Coffee
import com.gaganbelgur.com.gaganbelgur.MilkDecorator
import com.gaganbelgur.com.gaganbelgur.SimpleCoffee
import com.gaganbelgur.com.gaganbelgur.SugarDecorator

fun main() {

    var coffee: Coffee = SimpleCoffee()

    coffee = MilkDecorator(coffee)
    coffee = SugarDecorator(coffee)
    coffee = ChocolateDecorator(coffee)

    println(coffee.getDescription())
    println(coffee.coffeeCost())

}