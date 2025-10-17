package com.designpatterns.bridge;

import com.designpatterns.bridge.channels.*;
import com.designpatterns.bridge.payments.*;

public class BridgeDemo {

    public static void run() {
        System.out.println("\n=== E-Commerce Payment Notification Demo (Bridge Pattern) ===");

        PaymentNotification onlineEmail = new OnlinePaymentNotification(new EmailChannel());
        PaymentNotification onlineSms = new OnlinePaymentNotification(new SmsChannel());
        PaymentNotification cashEmail = new CashOnDeliveryPayment(new EmailChannel());
        PaymentNotification cashSms = new CashOnDeliveryPayment(new SmsChannel());

        PaymentNotification bitcoinEmail = new BitcoinPayment(new EmailChannel());
        PaymentNotification bitcoinSms = new BitcoinPayment(new SmsChannel());

        PaymentNotification onlinePush = new OnlinePaymentNotification(new PushChannel());
        PaymentNotification bitcoinPush = new BitcoinPayment(new PushChannel());

        System.out.println("\n--- Payment and Notification Scenarios ---\n");

        onlineEmail.sendPaymentMessage();
        onlineSms.sendPaymentMessage();
        cashEmail.sendPaymentMessage();
        cashSms.sendPaymentMessage();
        bitcoinEmail.sendPaymentMessage();
        bitcoinSms.sendPaymentMessage();
        onlinePush.sendPaymentMessage();
        bitcoinPush.sendPaymentMessage();

        System.out.println("\n=== End of Bridge Pattern Demo ===\n");
    }
}
