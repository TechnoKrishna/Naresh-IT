package com.example.elc;

import com.example.blc.Employee;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {
        Employee employee = new Employee();

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter aEmployee ID : ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Employee Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Employee Salary : ");
        double salary = Double.parseDouble(sc.nextLine());

        employee.setEmployeeDetails(id, name, salary);

        System.out.println("===== EMPLOYEE INFORMATION =====");
        System.out.println("Employee Details:");
        System.out.println(employee);

        System.out.println("===== SALARY INCREMENT DETAILS =====");
        employee.calculateSalaryIncrement();

    }
}
