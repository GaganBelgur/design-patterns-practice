package com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.Profile

fun main() {

    val profile = Profile.ProfileBuilder().setName("GaganBelgur").build()
    println(profile.name)

    val profile1 = Profile.ProfileBuilder()
        .setName("GaganBelgur")
        .setEmail("email")
        .build()

    println(profile1)
}
