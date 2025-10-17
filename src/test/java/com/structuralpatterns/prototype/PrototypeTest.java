package com.structuralpatterns.prototype;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {

    @Test
    void shallowCopyShouldShareChaptersList() throws CloneNotSupportedException {
        List<String> chapters = new ArrayList<>(Arrays.asList("Intro", "Factory Pattern"));
        BookShallowCopy original = new BookShallowCopy("Design Patterns", "Gamma", chapters);
        BookShallowCopy clone = original.clone();

        // modify original
        original.getChapters().add("Prototype Pattern");

        // because it's shallow, clone should see the change (same list reference)
        assertEquals(original.getChapters(), clone.getChapters());
        assertSame(original.getChapters(), clone.getChapters(), "Both should reference the same list instance");
    }

    @Test
    void deepCopyShouldHaveIndependentChaptersList() throws CloneNotSupportedException {
        List<String> chapters = new ArrayList<>(Arrays.asList("Intro", "Factory Pattern"));
        BookDeepCopy original = new BookDeepCopy("Design Patterns", "Gamma", chapters);
        BookDeepCopy clone = original.clone();

        // modify original
        original.getChapters().add("Prototype Pattern");

        // deep copy => lists should differ after modification
        assertNotEquals(original.getChapters(), clone.getChapters());
        assertNotSame(original.getChapters(), clone.getChapters(), "Lists should be different instances");
    }
}
