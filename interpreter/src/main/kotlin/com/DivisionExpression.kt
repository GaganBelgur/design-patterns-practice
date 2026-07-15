package com.gaganbelgur.com

class DivisionExpression(private val left: Expression, private val right: Expression) : Expression {
    override fun interpret() = left.interpret() / right.interpret()
}