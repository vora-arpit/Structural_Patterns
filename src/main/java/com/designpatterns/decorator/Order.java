package com.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(FoodItem::getCost).sum();
    }

    public List<FoodItem> getItems() {
        return items;
    }
}
