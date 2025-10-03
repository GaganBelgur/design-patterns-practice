package com.gaganbelgur.applegadgets

import com.gaganbelgur.GadgetsFactory
import com.gaganbelgur.Laptop
import com.gaganbelgur.SmartWatch

class AppleGadgetsFactory: GadgetsFactory {

    override fun createLaptop(): Laptop = AppleLaptop()

    override fun createSmartWatch(): SmartWatch = AppleSmartWatch()
}