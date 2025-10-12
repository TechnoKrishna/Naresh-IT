package example.elc;

import example.blc.Employee;

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee scott = new Employee();
        scott.setEmployeeData(101, "Scott", 90000);
        scott.calculateGrade();
        scott.getEmployeeData();

        System.out.println(".........");

        Employee smith = new Employee();
        smith.setEmployeeData(102, "Smith", 55000);
        smith.calculateGrade();
        smith.getEmployeeData();
    }
}
