package com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.Account
import com.gaganbelgur.com.gaganbelgur.AccountWithoutProtoType

fun main() {
    val originalAccount = Account(
        name = "Gagan Belgur",
        phone = "8844662224",
        email = "gaganbelgur@abc.com",
        birthDate = "24/12/96"
    )

    val cloned = originalAccount.clone()
    val copied = originalAccount.copy()

    val updated = cloned.copy(email = "belgurgagan@abc.com")

    println("Original: $originalAccount")
    println("Cloned: $cloned")
    println("Copied: $copied")
    println("Updated: $updated")

    println("Original Hashcode: ${originalAccount.hashCode()}")
    println("Cloned  Hashcode: ${cloned.hashCode()}")
    println("Copied  Hashcode: ${copied.hashCode()}")
    println("Updated  Hashcode: ${updated.hashCode()}")

    val originalAccountWOP = AccountWithoutProtoType(
        name = "Gagan Belgur",
        phone = "8844662224",
        email = "gaganbelgur@abc.com",
    )

    println("OriginalAWOP Hashcode: ${originalAccountWOP.hashCode()}")

    val copiedAWOP = originalAccountWOP.copy()
    println("copiedAWOP Hashcode: ${copiedAWOP.hashCode()}")
}