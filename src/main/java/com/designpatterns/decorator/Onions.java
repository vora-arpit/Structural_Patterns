package com.designpatterns.decorator;

public class Onions extends FoodDecorator {
    public Onions(FoodItem item) { super(item); }
    public String getDescription() { return foodItem.getDescription() + ", Onions"; }
    public double getCost() { return foodItem.getCost() + 0.7; }
}
