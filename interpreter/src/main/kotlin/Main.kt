package com.gaganbelgur

import com.gaganbelgur.com.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val additionExpression: Expression = AdditionExpression(NumberExpression(8), NumberExpression(8))
    println(additionExpression.interpret())

    val substractionExpression: Expression = SubstractionExpression(NumberExpression(8), NumberExpression(8))
    println(substractionExpression.interpret())

    val multiplicationExpression: Expression = MultiplicationExpression(NumberExpression(8), NumberExpression(8))
    println(multiplicationExpression.interpret())

    val divisionExpression: Expression = DivisionExpression(NumberExpression(8), NumberExpression(8))
    println(divisionExpression.interpret())

    SubstractionExpression(NumberExpression(101), AdditionExpression(
        MultiplicationExpression(NumberExpression(8), NumberExpression(8)),
        DivisionExpression(NumberExpression(8), NumberExpression(8))
    )).interpret().also { println(it) }
}