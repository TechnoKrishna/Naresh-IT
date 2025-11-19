class Test {
    static int x = 100;

    static {
        x = 200;
    }

    static
    {
        System.out.println(x);
    }
}

public class ReflectionAPI {
    public static void main(String[] args) {
        
        try {
            Class.forName("Test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
