package com.example.elc;

class Hello {
    final int x;
    {
        print();
        x = 100;
    }

    public void print() {
        System.out.println("Default value: " + x);
    }
}

public class BlankFinalField2 {
    public static void main(String[] args) {
        Hello h1 = new Hello();
        System.out.println("User Value: " + h1.x);
    }
}
