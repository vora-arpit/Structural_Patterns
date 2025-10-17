package com.structuralpatterns.prototype;

import java.util.List;

public class BookShallowCopy extends Book {

    public BookShallowCopy(String title, String author, List<String> chapters) {
        super(title, author, chapters);
    }

    /**
     * Returns a shallow copy: the top-level Book object is cloned, but the chapters list reference
     * is shared between original and clone.
     */
    @Override
    public BookShallowCopy clone() throws CloneNotSupportedException {
        return (BookShallowCopy) super.clone();
    }
}
