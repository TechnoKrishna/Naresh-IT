package com.example.elc;

class Student {
    private final String name; // Blank final field

    public Student() {
        name = "Scott";
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

public class BlankFinalFieldDemo3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getName());

        Student s2 = new Student("Smith");
        System.out.println(s2.getName());
    }
}
