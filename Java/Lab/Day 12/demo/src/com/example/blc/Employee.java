package com.example.blc;

public class Employee {

    private String firstName;
    private String lastName;
    private int employeeId;
    private double salary;
    private int NoOfProject;

    public Employee(String firstName, String lastName, int employeeId, double salary, int noOfProject) {

        if(NoOfProject < 0)
        {
            System.out.println("Invalid Number of Projects (Negative Value)");
            System.exit(0);
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.salary = salary;
        NoOfProject = noOfProject;
    }

    public void calculateSalary(){
        if(NoOfProject > 5 && NoOfProject < 10)
        {
            salary += 5000;
        } else if(NoOfProject >= 10 && NoOfProject < 20)
        {
            salary += 10000;
        } else if (NoOfProject >= 20) {
            salary += 15000;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                ", NoOfProject=" + NoOfProject +
                '}';
    }
}
