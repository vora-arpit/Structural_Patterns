package com.structuralpatterns.prototype;

import java.util.List;

public class Book implements Cloneable {
    protected String title;
    protected String author;
    protected List<String> chapters;

    public Book(String title, String author, List<String> chapters) {
        this.title = title;
        this.author = author;
        this.chapters = chapters;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public List<String> getChapters() { return chapters; }
    public void setChapters(List<String> chapters) { this.chapters = chapters; }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {title='" + title + "', author='" + author + "', chapters=" + chapters + "}";
    }

    /**
     * Provide a concrete clone implementation that subclasses can call via super.clone().
     * This delegates to Object.clone() which performs a shallow copy of the object.
     */
    @Override
    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }
}
