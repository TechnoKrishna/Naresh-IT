record Student(int roll, String name) {
}

record Employee(int id, double salary) {
}

class Sample {

    public static void accept(Student student) {
        System.out.println("Roll Number: " + student.roll());
        System.out.println("Student Name: " + student.name());
    }

    public static void accept(Employee employee) {
        System.out.println("Employee ID: " + employee.id());
        System.out.println("Salary: " + employee.salary());
    }
}

public class MOLDemo2 {
    public static void main(String[] args) {

        Sample.accept(new Employee(101, 50000));
        Sample.accept(new Student(1, "Raj"));
    }
}
