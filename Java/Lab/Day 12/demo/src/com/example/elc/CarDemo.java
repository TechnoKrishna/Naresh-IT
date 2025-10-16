package com.example.elc;

import com.example.blc.Car;

import java.util.Scanner;

public class CarDemo {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Car Model : ");
        String model=sc.nextLine();
        System.out.println("Enter Car Manufacturing : ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println("Car Price : ");
        double price= Double.parseDouble(sc.nextLine());

        Car car = new Car(model, year, price);

        System.out.println(car);

    }
}
