package com.structuralpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookDeepCopy extends Book {

    public BookDeepCopy(String title, String author, List<String> chapters) {
        super(title, author, chapters);
    }

    /**
     * Returns a deep copy with a new List instance for chapters.
     */
    @Override
    public BookDeepCopy clone() throws CloneNotSupportedException {
        BookDeepCopy copy = (BookDeepCopy) super.clone();          // shallow clone first
        copy.chapters = new ArrayList<>(this.chapters);           // deep copy of the list
        return copy;
    }
}
