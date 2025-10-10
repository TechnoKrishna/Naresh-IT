package com.example.blc;

public class Employee {

    public int employeeId;
    public String  employeeName;
    public double  employeeSalary;

    public void setEmployeeData(int employeeId, String employeeName, double employeeSalary)
    {
        {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.employeeSalary = employeeSalary;
        }
    }

    public void getEmployeeData()
    {
        System.out.println("Employee Id: " + this.employeeId + ", Name : " +  this.employeeName + ", Salary : " + this.employeeSalary);
    }

}
