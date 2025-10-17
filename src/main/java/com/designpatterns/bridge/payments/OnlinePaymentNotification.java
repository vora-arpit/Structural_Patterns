package com.designpatterns.bridge.payments;

import com.designpatterns.bridge.PaymentNotification;
import com.designpatterns.bridge.channels.NotificationChannel;

public class OnlinePaymentNotification extends PaymentNotification {
    public OnlinePaymentNotification(NotificationChannel channel) {
        super(channel);
    }

    public void sendPaymentMessage() {
        channel.send("Online payment successful via Credit Card/PayPal.");
    }
}
