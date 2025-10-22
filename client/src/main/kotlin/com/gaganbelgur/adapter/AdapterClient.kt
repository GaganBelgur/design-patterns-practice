package com.gaganbelgur.adapter

import com.gaganbelgur.CitiPaymentGateWay
import com.gaganbelgur.HDFCPaymentGateWay

fun main() {
    val hdfcPaymentGateWay = HDFCPaymentGateWay()
    val citiPaymentGateWay = CitiPaymentGateWay()

    val hdfcCheckOutService = CheckOutService(hdfcPaymentGateWay)
    val citiCheckOutService = CheckOutService(citiPaymentGateWay)

    hdfcCheckOutService.checkout("ORDER123", 250.0)
    citiCheckOutService.checkout("ORDER456", 500.0)
}