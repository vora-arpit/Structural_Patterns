package com.designpatterns;

import com.designpatterns.decorator.Burger;
import com.designpatterns.decorator.Cheese;
import com.designpatterns.decorator.FoodItem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest {
    @Test
    void testBurgerWithCheeseCost() {
        FoodItem burger = new Cheese(new Burger());
        assertEquals(6.0, burger.getCost());
    }
}
