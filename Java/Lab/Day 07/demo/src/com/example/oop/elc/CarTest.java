package com.example.oop.elc;

import com.example.oop.blc.Car;

public class CarTest {
    public static void main(String[] args) {

        Car car = new Car();

        car.name = "Audi R8";
        car.model = 203;
        car.color = "Blue";

        car.getCarInformation();
        car.drive();

    }
}
