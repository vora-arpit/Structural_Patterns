package com.designpatterns.bridge.payments;

import com.designpatterns.bridge.PaymentNotification;
import com.designpatterns.bridge.channels.NotificationChannel;

public class CashOnDeliveryPayment extends PaymentNotification {
    public CashOnDeliveryPayment(NotificationChannel channel) {
        super(channel);
    }

    public void sendPaymentMessage() {
        channel.send("Cash on delivery payment will be collected soon.");
    }
}
