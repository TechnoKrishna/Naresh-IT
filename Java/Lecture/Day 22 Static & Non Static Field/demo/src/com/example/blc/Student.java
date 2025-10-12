package com.example.blc;

public class Student {

    int rollNumber;
    String studentName;
    String studentAddress;
    static String collegeName = "NIT";
    static String courseName = "Adv. Java";

    public void setStudentData(int roll, String name, String address) {
        rollNumber = roll;
        studentName = name;
        studentAddress = address;
    }

    public void getStudentData() {
        System.out.println("Student Roll number is: " + rollNumber);
        System.out.println("Student Name is: " + studentName);
        System.out.println("Student Address is: " + studentAddress);
        System.out.println("College Name is: " + collegeName);
        System.out.println("Course Name is: " + courseName);
    }
}