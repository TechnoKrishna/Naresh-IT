class Demo {
    static {
        i = 100; // Initialization is possible due to prepare phase
    }
    static int i;
}

public class StaticBlockDemo5 {
    public static void main(String[] args) {
        System.out.println(Demo.i);
    }
}