package com.example.oop.blc;

public class Car {

    public String name;
    public int model;
    public String color;

    public void getCarInformation()
    {
        System.out.println(name + " Model No : " + model + " Color : " + color );
    }

    public  void drive()
    {
        System.out.println(name + " Drive Car");
    }

}
