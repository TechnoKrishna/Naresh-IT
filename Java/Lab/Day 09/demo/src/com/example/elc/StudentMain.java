package com.example.elc;

import com.example.blc.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setStudentData(101, "krishna", 95);
        student2.setStudentData(102, "Raj", 78);
        System.out.println(student1);
        System.out.println(student2);

    }
}
