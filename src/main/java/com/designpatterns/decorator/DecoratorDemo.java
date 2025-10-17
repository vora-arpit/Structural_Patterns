package com.designpatterns.decorator;

public class DecoratorDemo {
    public static void run() {
        System.out.println("\n=== Restaurant Order System (Decorator Pattern) ===");

        FoodItem burger = new Cheese(new Ketchup(new Burger()));
        FoodItem fries = new Onions(new Fries());
        FoodItem hotDog = new HotDog();

        Order order = new Order();
        order.addItem(burger);
        order.addItem(fries);
        order.addItem(hotDog);

        System.out.println("\nOrder Summary:");
        for (FoodItem item : order.getItems()) {
            System.out.println(" • " + item.getDescription() + " - $" + String.format("%.2f", item.getCost()));
        }

        double subtotal = order.calculateTotal();
        System.out.println("\nSubtotal: $" + String.format("%.2f", subtotal));

        LoyaltyStatus loyalty = new LoyaltyStatus("Gold", 0.20);
        double finalTotal = loyalty.applyDiscount(subtotal);

        System.out.println("Customer Loyalty: " + loyalty.getStatus() + " (20% discount)");
        System.out.println("Final Total after Discount: $" + String.format("%.2f", finalTotal));

        System.out.println("\n=== End of Decorator Pattern Demo ===");
    }
}
