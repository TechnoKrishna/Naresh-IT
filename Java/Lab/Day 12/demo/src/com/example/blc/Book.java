package com.example.blc;

public class Book {

    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {

        if(price < 0)
        {
            System.out.println("Price cannot be negative");
            System.exit(0);
        }

        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void applyDiscount(double discountPercentage)
    {

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
