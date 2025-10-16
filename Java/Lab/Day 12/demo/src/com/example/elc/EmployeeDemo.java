package com.example.elc;

import com.example.blc.Employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name : ");
        String firstName = sc.nextLine();
        System.out.println("Enter Last Name : ");
        String lastName = sc.nextLine();
        System.out.println("Enter Employee ID : ");
        int employeeID = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Salary : ");
        double salary = Double.parseDouble(sc.nextLine());
        System.out.println("Enter No of Project : ");
        int projectNo = Integer.parseInt(sc.nextLine());

        Employee employee = new Employee(firstName, lastName, employeeID, salary, projectNo);
        employee.calculateSalary();
        System.out.println(employee);


    }
}
