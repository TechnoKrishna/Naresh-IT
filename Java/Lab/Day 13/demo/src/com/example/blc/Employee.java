package com.example.blc;

public class Employee {

    private int employeeId;
    private String EmployeeName;
    private double EmployeeSalary;

    public Employee(int employeeId, String EmployeeName, double EmployeeSalary) {
        this.employeeId = employeeId;
        this.EmployeeName = EmployeeName;
        this.EmployeeSalary = EmployeeSalary;
    }

    public double getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        EmployeeSalary = employeeSalary;
    }

    public String getEmployeeDesignation()
    {
        if(EmployeeSalary == 120000)
        {
            return "\nEmployee is a HR Manager";
        }
        else if(EmployeeSalary == 90000)
        {
            return "\nEmployee is a Developer";
        }
        else if(EmployeeSalary == 60000)
        {
            return "\nEmployee is a Designer";
        }
        else
        {
            return "\nEmployee is a Tester";
        }
    }

    @Override
    public String toString() {
        return "\"===== EMPLOYEE DETAILS =====\"" + "\n" + "Employee Number : " + this.employeeId + "\n" + "Employee Name : " + this.EmployeeName + "\n" + "Employee Salary : " + this.EmployeeSalary;
    }
}
