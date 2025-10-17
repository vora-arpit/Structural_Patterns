package com.designpatterns.bridge.payments;

import com.designpatterns.bridge.PaymentNotification;
import com.designpatterns.bridge.channels.NotificationChannel;

public class BitcoinPayment extends PaymentNotification {
    public BitcoinPayment(NotificationChannel channel) {
        super(channel);
    }

    public void sendPaymentMessage() {
        channel.send("Bitcoin payment received successfully.");
    }
}
