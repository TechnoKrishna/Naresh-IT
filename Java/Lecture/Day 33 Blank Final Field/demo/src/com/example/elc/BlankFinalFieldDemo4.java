package com.example.elc;

class Students {
    private final String name; // Blank final field

    {
        name = "Raj"; // Initialized in non-static block
    }

    public Students() {}

    public Students(String name) {}

    public String getName() {
        return this.name;
    }
}

public class BlankFinalFieldDemo4 {
    public static void main(String[] args) {
        Students s1 = new Students();
        System.out.println(s1.getName());

        Students s2 = new Students("Smith");
        System.out.println(s2.getName());
    }
}