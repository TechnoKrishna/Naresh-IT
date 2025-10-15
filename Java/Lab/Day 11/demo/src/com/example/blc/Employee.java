package com.example.blc;

public class Employee {

    private int id;
    private String name;
    private double salary;

    public void setEmployeeDetails(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void calculateSalaryIncrement()
    {
        double increment = 0.0;
        double TotalSalary;

        if(salary > 80000)
        {
            increment = salary * 0.05;
        }
        else if(salary >= 50000 && salary <= 80000)
        {
            increment = salary * 0.07;
        }
        else {
            increment = salary * 0.10;
        }

        TotalSalary = salary + increment;

        System.out.println("Salary increment is: " + increment);
        System.out.println("After Increment, Updated salary: " + TotalSalary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
