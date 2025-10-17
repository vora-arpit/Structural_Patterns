package com.structuralpatterns.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrototypeDemo {

    public static void runDemo() {
        try {
            System.out.println("\n=== Shallow Copy Demo ===");
            List<String> shallowChapters = new ArrayList<>(Arrays.asList("Introduction", "Design Patterns Overview"));
            BookShallowCopy shallowOriginal = new BookShallowCopy("Design Patterns", "Gamma", shallowChapters);
            BookShallowCopy shallowClone = shallowOriginal.clone();

            System.out.println("Before modification:");
            System.out.println("Original: " + shallowOriginal);
            System.out.println("Clone   : " + shallowClone);

            // Modify only the original's chapters (works because list is mutable)
            shallowOriginal.getChapters().add("Prototype Pattern");

            System.out.println("\nAfter modifying original's chapters:");
            System.out.println("Original: " + shallowOriginal);
            System.out.println("Clone   : " + shallowClone);

            System.out.println("\n=== Deep Copy Demo ===");
            List<String> deepChapters = new ArrayList<>(Arrays.asList("Introduction", "Design Patterns Overview"));
            BookDeepCopy deepOriginal = new BookDeepCopy("Design Patterns", "Gamma", deepChapters);
            BookDeepCopy deepClone = deepOriginal.clone();

            System.out.println("Before modification:");
            System.out.println("Original: " + deepOriginal);
            System.out.println("Clone   : " + deepClone);

            // Modify only the original's chapters
            deepOriginal.getChapters().add("Prototype Pattern");

            System.out.println("\nAfter modifying original's chapters:");
            System.out.println("Original: " + deepOriginal);
            System.out.println("Clone   : " + deepClone);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
