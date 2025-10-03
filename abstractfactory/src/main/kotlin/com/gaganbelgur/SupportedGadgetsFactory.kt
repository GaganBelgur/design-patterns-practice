package com.gaganbelgur

import com.gaganbelgur.applegadgets.AppleGadgetsFactory
import com.gaganbelgur.samsunggadgets.SamsungGadgetsFactory

sealed class SupportedGadgetsFactory {

    abstract fun create(): GadgetsFactory

    object SamsungGadgetsFactory: SupportedGadgetsFactory() {
        override fun create(): GadgetsFactory = SamsungGadgetsFactory()
    }

    object AppleGadgetsFactory: SupportedGadgetsFactory() {
        override fun create(): GadgetsFactory = AppleGadgetsFactory()
    }

    companion object {
        val SUPPORTED_GADGETS_FACTORY = listOf<SupportedGadgetsFactory>(SamsungGadgetsFactory, AppleGadgetsFactory)
    }
}