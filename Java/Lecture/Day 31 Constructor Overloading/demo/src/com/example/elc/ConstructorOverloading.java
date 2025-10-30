package com.example.elc;

class Addition {

    public Addition(int x, int y) {
        super();
        System.out.println("Sum of two integers: " + (x + y));
    }

    public Addition(String x, String y) {
        this(12, 20);
        System.out.println("Concatenation of two strings: " + (x + y));
    }

    public Addition(double x, double y) {
        this("Batch", " 51");
        System.out.println("Sum of two doubles: " + (x + y));
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Addition a1 = new Addition(2.3, 6.7);
    }
}