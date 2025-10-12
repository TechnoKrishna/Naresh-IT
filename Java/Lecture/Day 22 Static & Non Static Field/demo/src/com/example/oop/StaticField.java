package com.example.oop;

class Tests {
    static int x = 10; // static field
}

public class StaticField {
    public static void main(String[] args) {
        Tests t1 = new Tests();
        Tests t2 = new Tests();

        ++t1.x;  // increases shared x
        ++t2.x;  // increases same shared x again

        System.out.println(t1.x); // 12
        System.out.println(t2.x); // 12
    }
}