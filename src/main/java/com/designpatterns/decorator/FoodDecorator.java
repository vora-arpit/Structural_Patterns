package com.designpatterns.decorator;

public abstract class FoodDecorator implements FoodItem {
    protected FoodItem foodItem;

    public FoodDecorator(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    public String getDescription() {
        return foodItem.getDescription();
    }

    public double getCost() {
        return foodItem.getCost();
    }
}
