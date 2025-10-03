package com.gaganbelgur

fun main() {

    val appleProducts = SupportedGadgetsFactory.AppleGadgets.create()
    val macBook = appleProducts.createLaptop()
    macBook.start()
    macBook.shutDown()
}