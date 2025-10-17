package com.example.elc;

import com.example.blc.Employee;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Employee Number : ");
        int employeeNumber = input.nextInt();
        System.out.println("Enter Employee Name : ");
        String employeeName = input.next();
        System.out.println("Enter Employee Salary");
        double salary = Double.parseDouble(input.next());

        Employee employee = new Employee(employeeNumber, employeeName, salary);

        System.out.println(employee);

        System.out.println("Enter Increment Amount");
        double increment = Double.parseDouble(input.next());

        employee.setEmployeeSalary(employee.getEmployeeSalary() + increment);

        System.out.println(employee);

        System.out.println(employee.getEmployeeDesignation());





    }

}
