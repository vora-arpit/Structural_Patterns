package com.designpatterns.bridge.channels;

public class EmailChannel implements NotificationChannel {
    public void send(String message) {
        System.out.println("[Email] " + message);
    }
}
