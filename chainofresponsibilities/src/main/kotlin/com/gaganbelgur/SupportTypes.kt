package com.gaganbelgur.com.gaganbelgur

sealed class SupportTypes {
    object GeneralSupport: SupportTypes()
    object TechnicalSupport: SupportTypes()
    object DeliverySupport: SupportTypes()
    object BillingSupport: SupportTypes()
}