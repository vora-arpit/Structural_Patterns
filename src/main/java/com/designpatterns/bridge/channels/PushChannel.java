package com.designpatterns.bridge.channels;

public class PushChannel implements NotificationChannel {
    public void send(String message) {
        System.out.println("[Push] " + message);
    }
}
