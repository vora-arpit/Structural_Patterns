package com.designpatterns.decorator;

public class Ketchup extends FoodDecorator {
    public Ketchup(FoodItem item) { super(item); }
    public String getDescription() { return foodItem.getDescription() + ", Ketchup"; }
    public double getCost() { return foodItem.getCost() + 0.5; }
}
