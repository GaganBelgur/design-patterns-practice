package com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.EmailNotification
import com.gaganbelgur.com.gaganbelgur.SMSNotification

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val sms = SMSNotification()
    sms.send("9898989898", "Thanks for reading!")

    println()

    val email = EmailNotification()
    email.send("gaganbelgur@gmail.com", "Thanks for reading! Thanks and Regards Gagan Belgur CEO HIOX STAR")
}