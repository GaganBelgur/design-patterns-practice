package com.gaganbelgur

import com.gaganbelgur.applegadgets.AppleGadgetsFactory
import com.gaganbelgur.samsunggadgets.SamsungGadgetsFactory

sealed class SupportedGadgetsFactory {

    abstract fun create(): GadgetsFactory

    object SamsungGadgets: SupportedGadgetsFactory() {
        override fun create(): GadgetsFactory = SamsungGadgetsFactory()
    }

    object AppleGadgets: SupportedGadgetsFactory() {
        override fun create(): GadgetsFactory = AppleGadgetsFactory()
    }

    companion object {
        val SUPPORTED_GADGETS = listOf<SupportedGadgetsFactory>(SamsungGadgets, AppleGadgets)
    }
}