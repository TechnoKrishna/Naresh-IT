import java.util.Arrays;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
}

public class ArrayDemo2 {
    public static void main(String[] args) {
        Student students[] = new Student[5];

        students[0] = new Student(111, "Raj");
        students[1] = new Student(222, "Ram");
        students[2] = new Student(333, "Rahul");
        students[3] = new Student(444, "Scott");
        students[4] = new Student(555, "Alen");

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
