class TemporaryEmployee {
    protected int id;
    protected String name;
    protected double salary;

    public TemporaryEmployee(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

class PermanentEmployee extends TemporaryEmployee {
    protected String department;
    protected String designation;

    public PermanentEmployee(int id, String name, double salary, String department, String designation) {
        super(id, name, salary);
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "PermanentEmployee [id=" + id + ", name=" + name + ", salary=" + salary +
                ", department=" + department + ", designation=" + designation + "]";
    }
}

public class SingleLevel {
    public static void main(String[] args) {
        PermanentEmployee pemployee = new PermanentEmployee(1, "Scott", 90000, "IT", "Developer");
        System.out.println(pemployee);
    }
}
