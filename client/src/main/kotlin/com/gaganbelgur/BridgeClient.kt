package com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.examples.firstexample.colors.BlueColor
import com.gaganbelgur.com.gaganbelgur.examples.firstexample.colors.WhiteColor
import com.gaganbelgur.com.gaganbelgur.examples.firstexample.shapes.CircleShape
import com.gaganbelgur.com.gaganbelgur.examples.firstexample.shapes.SquareShape
import com.gaganbelgur.com.gaganbelgur.examples.secondexample.gateways.EndeavourGateWay
import com.gaganbelgur.com.gaganbelgur.examples.secondexample.gateways.PulseGateWay
import com.gaganbelgur.com.gaganbelgur.examples.secondexample.payments.UPIPayment

fun main() {
    val blueCircleShape = CircleShape(BlueColor())
    blueCircleShape.draw()

    val whiteSquareShape = SquareShape(WhiteColor())
    whiteSquareShape.draw()

    val paymentGateWay = EndeavourGateWay()
    val payment = UPIPayment(paymentGateWay)
    payment.makePayment("ORDER123", 2500.0)

    val anotherPayment = UPIPayment(PulseGateWay())
    anotherPayment.makePayment("ORDER456", 1500.0)
}