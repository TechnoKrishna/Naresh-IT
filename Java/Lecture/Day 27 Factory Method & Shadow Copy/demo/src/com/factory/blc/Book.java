package com.factory.blc;

public class Book {

    private String title;
    private String author;

    private Book(String title, String author) {
        super();
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + "]";
    }

    // static factory method
    public static Book getBookObject() {
        return new Book("Java", "James Gosling");
    }
}
