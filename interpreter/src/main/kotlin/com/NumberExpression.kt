package com.gaganbelgur.com

class NumberExpression(private val number: Int) : Expression {
    override fun interpret(): Int {
        return number
    }
}