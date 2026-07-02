package com.gaganbelgur.com.gaganbelgur.serviceimpl

import com.gaganbelgur.com.gaganbelgur.service.NotificationService


class NotificationServiceImpl: NotificationService {
    override fun send(msg: String): Boolean = println("Notification sent: $msg").let { true }
}