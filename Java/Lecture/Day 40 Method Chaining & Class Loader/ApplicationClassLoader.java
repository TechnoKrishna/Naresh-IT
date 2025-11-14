class Test {
}

public class ApplicationClassLoader {
    public static void main(String[] args) {
        Class cls = Test.class;
        System.out.println("Test.class is loaded by: " + cls.getClassLoader());
    }
}