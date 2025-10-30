package com.example.blc;

public class Car {
    private String name;
    private int model;
    private final Engine engine; // Blank final field

    public Car(String name, int model) {
        super();
        this.name = name;
        this.model = model;
        this.engine = new Engine("Petrol", 1000);
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", model=" + model + ", engine=" + engine + "]";
    }
}
