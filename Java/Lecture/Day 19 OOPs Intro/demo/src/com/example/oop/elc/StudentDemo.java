package com.example.oop.elc;
import com.example.oop.blc.Student;

public class StudentDemo {
    public static void main(String[] args) {
        Student raj = new Student();   //Initializing the object properties (NSF) through object reference

        raj.rollNumber = 101;
        raj.name = "Raj Gourav";
        raj.height = 5.9;

        //Calling the behavior
        raj.talk();
        raj.writeExam();

        System.out.println("------------------------------------------------------------");

        Student priya = new Student();  //Initializing the object properties (NSF) through object reference
        priya.rollNumber = 201;
        priya.name = "Priya";
        priya.height = 5.7;

        //Calling the behavior

        priya.talk();
        priya.writeExam();
    }
}
