package com.gaganbelgur.com.gaganbelgur

class PremiumCustomerMatchingStrategy: MatchingStrategy {
    override fun match(location: String) {
        println("Premium Customer Matching Strategy $location")
    }
}