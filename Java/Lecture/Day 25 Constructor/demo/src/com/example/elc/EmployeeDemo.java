package com.example.elc;

class Employee {
    private int id;
    private String name;

    public Employee() { }

    public void set(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();     // Variable initialization with default value
        emp.set(111, "Raj");               // Variable re-initialization with user valu
    }
}
