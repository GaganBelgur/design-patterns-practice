package com.gaganbelgur.com.gaganbelgur.service

fun interface NotificationService {
    fun send(msg: String): Boolean
}