package com.designpatterns.decorator;

public class LoyaltyStatus {
    private final String status;
    private final double discountRate;

    public LoyaltyStatus(String status, double discountRate) {
        this.status = status;
        this.discountRate = discountRate;
    }

    public String getStatus() {
        return status;
    }

    public double applyDiscount(double total) {
        return total - (total * discountRate);
    }
}
