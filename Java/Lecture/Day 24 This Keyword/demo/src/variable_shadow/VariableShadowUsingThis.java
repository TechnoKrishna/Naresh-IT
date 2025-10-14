package variable_shadow;

class Student1 {
    private int roll = 101;
    private String name = "Scott";
    public static String course = "Java";

    public void accept(int roll) {
        String name = "Raj";
        String course = "HTML";

        System.out.println("Roll number is: " + this.roll);
        System.out.println("Name is: " + this.name);
        System.out.println("Course is: " + Student.course);
    }
}

public class VariableShadowUsingThis {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.accept(999);
    }
}

