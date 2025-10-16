package com.example.elc;

class Employee1 {
    private int id;
    private String name;

    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


public class EmployeeDemo1 {

    public static void main(String[] args) {
        Employee1 emp = new Employee1(101, "Raj");

    }
}
