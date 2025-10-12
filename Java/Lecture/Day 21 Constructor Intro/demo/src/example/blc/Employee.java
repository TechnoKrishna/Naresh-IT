package example.blc;

public class Employee {

    int employeeId;
    String employeeName;
    double employeeSalary;
    char employeeGrade;

    public void setEmployeeData(int id, String name, double salary) {
        employeeId = id;
        employeeName = name;
        employeeSalary = salary;
    }

    public void getEmployeeData() {
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
        System.out.println("Employee Grade: " + employeeGrade);
    }

    public void calculateGrade() {
        if (employeeSalary >= 75000) {
            employeeGrade = 'A';
        } else if (employeeSalary >= 50000) {
            employeeGrade = 'B';
        } else if (employeeSalary >= 40000) {
            employeeGrade = 'C';
        } else {
            employeeGrade = 'D';
        }
    }
}
