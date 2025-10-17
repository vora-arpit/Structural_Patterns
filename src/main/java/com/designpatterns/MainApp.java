package com.designpatterns;

import com.designpatterns.bridge.BridgeDemo;
import com.designpatterns.decorator.DecoratorDemo;
import com.designpatterns.refresher.PatternRefresher;

public class MainApp {
    public static void main(String[] args) {
        PatternRefresher.intro();
        BridgeDemo.run();
        DecoratorDemo.run();
    }
}
