package com.gaganbelgur.applegadgets

import com.gaganbelgur.Laptop

class AppleLaptop : Laptop {

    override fun start() = println("Apple Laptop Started")

    override fun shutDown() = println("Apple Laptop Shut Down")
}