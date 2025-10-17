package com.factory.blc;

public class Product {

    private int id;
    private String name;
    private double price;

    private Product(int id, String name, double price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

    // static factory method
    public static Product getProductObject(int id, String name, double price) {
        return new Product(id, name, price);
    }
}
