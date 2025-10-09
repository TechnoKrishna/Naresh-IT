package com.example.oop.elc;

import com.example.oop.blc.Laptop;

public class LaptopTest {
    public static void main(String[] args) {

        Laptop asus = new Laptop();
        Laptop lenovo = new Laptop();

        asus.name = "Asus";
        asus.model = 2023;
        asus.graphicCard = "RTX1650";
        asus.ram = 16;
        asus.processor = "Intel i5 11th Gen";
        asus.Typing();
        asus.playGame();

        lenovo.name = "Lenovo";
        lenovo.model = 2021;
        lenovo.graphicCard = "RTX1650";
        lenovo.ram = 8;
        lenovo.processor = "Intel i5 10th Gen";
        lenovo.Typing();
        lenovo.playGame();

    }
}
