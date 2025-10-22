package com.gaganbelgur.adapter

import com.gaganbelgur.CitiPaymentGateWay
import com.gaganbelgur.HDFCPaymentGateWay
import com.gaganbelgur.legacy.SBIPaymentGateWayAdapter

fun main() {
    val hdfcPaymentGateWay = HDFCPaymentGateWay()
    val citiPaymentGateWay = CitiPaymentGateWay()

    val hdfcCheckOutService = CheckOutService(hdfcPaymentGateWay)
    val citiCheckOutService = CheckOutService(citiPaymentGateWay)

    hdfcCheckOutService.checkout("ORDER123", 250.0)
    citiCheckOutService.checkout("ORDER456", 500.0)

    val sbiPaymentGateWayAdapter = SBIPaymentGateWayAdapter()
    val sbiCheckOutService = CheckOutService(sbiPaymentGateWayAdapter)
    sbiCheckOutService.checkout("ORDER789", 750.0)
}