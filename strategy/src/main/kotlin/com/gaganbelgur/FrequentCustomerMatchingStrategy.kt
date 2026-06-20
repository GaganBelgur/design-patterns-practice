package com.gaganbelgur.com.gaganbelgur

class FrequentCustomerMatchingStrategy: MatchingStrategy {
    override fun match(location: String) {
        println("Frequently Booking Customer $location")
    }
}