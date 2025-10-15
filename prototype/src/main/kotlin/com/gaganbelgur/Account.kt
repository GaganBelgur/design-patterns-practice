package com.gaganbelgur.com.gaganbelgur

data class Account(
    val name: String,
    val phone: String,
    val email: String,
    val birthDate: String,
) : ProtoType<Account> {

    override fun clone(): Account {
        return copy()
    }
}
