class Student {

    int roll;
    String name;

    // Default no-argument constructor
    public Student() {
    }

    public void show() {
        System.out.print(roll + ":" + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student raj = new Student();
    }
}