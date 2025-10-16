package com.example.blc;

public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        super();
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // getter
    public double getSalary() {
        return salary;
    }

    // setter
    public void setSalary(double salary) {
        if (salary < this.salary) {
            System.err.println("Invalid Data");
            System.exit(0);
        }
        this.salary = salary;
    }
}
