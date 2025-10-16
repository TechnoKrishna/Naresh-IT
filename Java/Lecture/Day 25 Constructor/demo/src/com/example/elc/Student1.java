package com.example.elc;

class Student1 {
    public Student1() {
        System.out.println("I am Constructor");
        return; // Valid (no value)
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1();
    }
}