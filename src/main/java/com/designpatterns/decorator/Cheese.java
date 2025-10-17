package com.designpatterns.decorator;

public class Cheese extends FoodDecorator {
    public Cheese(FoodItem item) { super(item); }
    public String getDescription() { return foodItem.getDescription() + ", Cheese"; }
    public double getCost() { return foodItem.getCost() + 1.0; }
}
