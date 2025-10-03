package com.gaganbelgur.samsunggadgets

import com.gaganbelgur.GadgetsFactory
import com.gaganbelgur.Laptop
import com.gaganbelgur.SmartWatch

internal class SamsungGadgetsFactory: GadgetsFactory {

    override fun createLaptop(): Laptop = SamsungLaptop()

    override fun createSmartWatch(): SmartWatch = SamsungSmartWatch()
}