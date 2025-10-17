package com.designpatterns.bridge;

import com.designpatterns.bridge.channels.NotificationChannel;

public abstract class PaymentNotification {
    protected NotificationChannel channel;

    public PaymentNotification(NotificationChannel channel) {
        this.channel = channel;
    }

    public abstract void sendPaymentMessage();
}
