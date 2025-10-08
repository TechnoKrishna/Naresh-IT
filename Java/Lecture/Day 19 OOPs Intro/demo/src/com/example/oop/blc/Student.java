package com.example.oop.blc;

public class Student
{
    public int rollNumber; //Non-static field
    public String name;    //Non-static field
    public double height;  //Non-static field

    public void talk()
    {
        System.out.println("Hello learner, I am"+ name);
        System.out.println("My roll number is " + rollNumber);
        System.out.println("My height is " + height);
    }

    public void writeExam()
    {
        System.out.println("I am "+name+" every saturday I am writing exam!!!");
    }
}
