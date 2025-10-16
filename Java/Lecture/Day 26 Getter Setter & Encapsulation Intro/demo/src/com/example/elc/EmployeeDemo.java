package com.example.elc;

import com.example.blc.Employee;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = Double.parseDouble(sc.nextLine());

        Employee emp = new Employee(name, salary);
        System.out.println(emp);

        System.out.print("Enter your increment amount: ");
        double increment = Double.parseDouble(sc.nextLine());

        emp.setSalary(emp.getSalary() + increment);
        System.out.println(emp);

        sc.close();
    }
}