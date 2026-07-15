package com.gaganbelgur.com

class SubstractionExpression(private val left: Expression, private val right: Expression) : Expression {
    override fun interpret() = left.interpret() - right.interpret()
}