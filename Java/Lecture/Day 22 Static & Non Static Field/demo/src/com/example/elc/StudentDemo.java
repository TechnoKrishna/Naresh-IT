package com.example.elc;

import com.example.blc.Student;

public class StudentDemo {

    public static void main(String[] args) {
        Student raj = new Student();
        raj.setStudentData(101, "Raj", "Ameerpet");
        raj.getStudentData();

        System.out.println("...........");

        Student priya = new Student();
        priya.setStudentData(102, "Priya", "S R Nagar");
        priya.getStudentData();
    }
}
