package com.example.blc;

public class Dog {
    private String name;
    private String color;
    private double height;
    private int age;

    public Dog(String name, String color, double height, int age) {
        super();
        this.name = name;
        this.color = color;
        this.height = height;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", color=" + color + ", height=" + height + ", age=" + age + "]";
    }
}
