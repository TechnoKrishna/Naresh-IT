class Employee {
    private double salary = 75000;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class PassByValueDemo2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println(e1.getSalary()); // 75000

        accept(e1);
        System.out.println(e1.getSalary()); // 75000
    }

    public static void accept(Employee emp) {
        emp = new Employee();
        emp.setSalary(90000);
    }
}