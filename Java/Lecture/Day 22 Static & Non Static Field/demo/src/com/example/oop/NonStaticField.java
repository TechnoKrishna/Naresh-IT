package com.example.oop;

class Test {
    int x = 10;  // non-static field
}

public class NonStaticField {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        ++t1.x;   // increases t1’s x (10 → 11)
        --t2.x;   // decreases t2’s x (10 → 9)

        System.out.println(t1.x); // 11
        System.out.println(t2.x); // 9
    }
}
