package com.gaganbelgur.com

class AdditionExpression(private val left: Expression, private val right: Expression) : Expression {
    override fun interpret() = left.interpret() + right.interpret()
}