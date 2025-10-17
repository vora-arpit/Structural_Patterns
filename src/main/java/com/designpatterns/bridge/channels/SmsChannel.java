package com.designpatterns.bridge.channels;

public class SmsChannel implements NotificationChannel {
    public void send(String message) {
        System.out.println("[SMS] " + message);
    }
}
