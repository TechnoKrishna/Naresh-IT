package com.example.elc;

import com.example.blc.Manager;

public class ManagerDemo {
    public static void main(String[] args) {
        Manager smith = new Manager();
        smith.setManagerData(101, "Mr Smith", 89000);
        System.out.println(smith); // Automatically calls smith.toString()
        System.out.println("...");

        Manager alen = new Manager();
        alen.setManagerData(102, "Mr Alen", 95000);
        System.out.println(alen); // Automatically calls alen.toString()
    }
}