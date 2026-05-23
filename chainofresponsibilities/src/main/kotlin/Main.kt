package com.gaganbelgur

import com.gaganbelgur.com.gaganbelgur.SupportService

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val supportService = SupportService()

    supportService.handleSupportRequest("delivery")
    supportService.handleSupportRequest("other")
}