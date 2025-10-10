package com.example.elc;

import com.example.blc.Employee;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.setEmployeeData(101, "krishna", 12000);
        e1.getEmployeeData();

        Employee e2 = new Employee();

        e2.setEmployeeData(102, "krishna", 12000);
        e2.getEmployeeData();

    }
}
