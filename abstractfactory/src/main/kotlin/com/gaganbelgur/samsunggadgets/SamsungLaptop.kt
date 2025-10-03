package com.gaganbelgur.samsunggadgets

import com.gaganbelgur.Laptop

internal class SamsungLaptop : Laptop {

    override fun start() = println("Samsung Laptop Started")

    override fun shutDown() = println("Samsung Laptop Shut Down")
}