package com.gaganbelgur

fun main() {

    val appleProducts = SupportedGadgetsFactory.AppleGadgetsFactory.create()
    val macBook = appleProducts.createLaptop()
    macBook.start()
    macBook.shutDown()
}