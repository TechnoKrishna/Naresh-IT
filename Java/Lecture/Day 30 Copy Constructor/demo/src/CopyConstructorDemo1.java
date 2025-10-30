class Employee {
    private int employeeId;
    private String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    // Getters and Setters
    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
    }
}

class Manager {
    private int managerId;
    private String managerName;

    public Manager(Employee emp) {
        this.managerId = emp.getEmployeeId();
        this.managerName = emp.getEmployeeName();
    }

    @Override
    public String toString() {
        return "Manager [managerId=" + managerId + ", managerName=" + managerName + "]";
    }
}

public class CopyConstructorDemo1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(111, "Scott");
        System.out.println(e1);

        Manager m1 = new Manager(e1);
        System.out.println(m1);
    }
}