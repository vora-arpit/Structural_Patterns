package com.designpatterns.decorator;

public class Burger implements FoodItem {
    public String getDescription() { return "Burger"; }
    public double getCost() { return 5.0; }
}