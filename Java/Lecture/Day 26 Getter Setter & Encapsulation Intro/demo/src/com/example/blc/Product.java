package com.example.blc;

public class Product {

    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        if (id < 0 || name == null || name.isBlank() || price < 0) {
            System.err.println("Invalid Data");
            System.exit(0);
        }
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}