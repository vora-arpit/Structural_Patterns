package com.designpatterns;

import com.designpatterns.bridge.channels.EmailChannel;
import com.designpatterns.bridge.payments.OnlinePaymentNotification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BridgeTest {
    @Test
    void testOnlineEmailNotification() {
        OnlinePaymentNotification payment = new OnlinePaymentNotification(new EmailChannel());
        assertNotNull(payment);
    }
}
