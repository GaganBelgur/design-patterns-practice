package com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.BookingFacade

fun main() {
    val bookingFacade = BookingFacade()
    bookingFacade.book("12345", 100.0, "product-001", "Booking successful!", 2)
}