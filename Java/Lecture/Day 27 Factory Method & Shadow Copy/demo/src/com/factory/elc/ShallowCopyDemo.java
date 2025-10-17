package com.factory.elc;

import com.factory.blc.Laptop;

public class ShallowCopyDemo {

    public static void main(String[] args) {

        Laptop lap1 = new Laptop("HP", 90000);
        System.out.println(lap1);

        Laptop lap2 = lap1;
        lap2.setBrand("Dell");
        lap2.setPrice(95000);

        System.out.println("After modification through Setter !!");
        System.out.println(lap1); // Dell 95000
        System.out.println(lap2); // Dell 95000
    }
}