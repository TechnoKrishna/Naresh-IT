package com.example.blc;

public class Manager {

    public int managerId;
    private String managerName;
    private double managerSalary;

    public void setManagerData(int id, String name, double salary) {
        managerId = id;
        managerName = name;
        managerSalary = salary;
    }

    // Overriding toString() method
    public String toString() {
        return "Manager [managerId=" + managerId +
                ", managerName=" + managerName +
                ", managerSalary=" + managerSalary + "]";
    }
}
