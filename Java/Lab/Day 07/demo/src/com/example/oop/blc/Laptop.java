package com.example.oop.blc;

public class Laptop {

    public String name;
    public int ram;
    public String graphicCard;
    public int model;
    public String processor;

    public void Typing()
    {
        System.out.println("Using My New : " + name + " " + model + " Varient" + " has " + ram + " GB RAM & " + graphicCard + " Graphic Card & " + processor + " Processor");
    }

    public void playGame()
    {
        System.out.println("I Started Playing Game....");
    }
}
