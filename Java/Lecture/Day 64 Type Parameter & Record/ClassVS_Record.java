import java.util.Objects;

// Class

class EmployeeClass {
    private int id;
    private String name;

    public EmployeeClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeClass [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof EmployeeClass))
            return false;
        EmployeeClass other = (EmployeeClass) obj;
        return id == other.id && Objects.equals(name, other.name);
    }
}

// Record

record EmployeeRecord(int id, String name) {
    // Compact Constructor (Validation)
    public EmployeeRecord {
        if (id <= 0) {
            System.err.println("id must be positive");
            System.exit(0);
        }
    }
}

public class ClassVS_Record {
    public static void main(String[] args) {

        EmployeeClass ec1 = new EmployeeClass(111, "Scott");
        System.out.println(ec1);

        EmployeeClass ec2 = new EmployeeClass(111, "Scott");
        System.out.println(ec1.equals(ec2));
        System.out.println(ec1.hashCode() + " " + ec2.hashCode());
        System.out.println(ec1.getId() + " " + ec1.getName());

        System.out.println("............................");

        EmployeeRecord rec1 = new EmployeeRecord(999, "Raj");
        System.out.println(rec1);

        EmployeeRecord rec2 = new EmployeeRecord(999, "Raj");
        System.out.println(rec1.equals(rec2));
        System.out.println(rec1.hashCode() + " " + rec2.hashCode());
        System.out.println(rec1.id() + " : " + rec1.name());
    }
}



