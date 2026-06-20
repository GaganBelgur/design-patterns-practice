package com.gaganbelgur.com.gaganbelgur

class RideMatchingService(private var matchingStrategy: MatchingStrategy): MatchingService {

    fun setStrategy(matchingStrategy: MatchingStrategy) {
        this.matchingStrategy = matchingStrategy
    }

    override fun match(location: String) {
        matchingStrategy.match(location)
    }
}