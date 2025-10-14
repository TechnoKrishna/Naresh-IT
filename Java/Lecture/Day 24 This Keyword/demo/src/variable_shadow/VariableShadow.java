package variable_shadow;

class Student {
    private int roll = 101;
    private String name = "Scott";
    public static String course = "Java";

    public void accept(int roll) {
        String name = "Raj";
        String course = "HTML";

        System.out.println("Roll number is: " + roll);
        System.out.println("Name is: " + name);
        System.out.println("Course is: " + course);
    }
}

public class VariableShadow {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.accept(999);
    }
}
