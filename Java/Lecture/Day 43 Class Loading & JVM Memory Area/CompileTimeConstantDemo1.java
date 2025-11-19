class Sample {

    public static final int A = 100; // Compile Time Constant

    static {
        System.out.println("Static Block");
    }
}

public class CompileTimeConstantDemo1 {
    public static void main(String[] args) {
        System.out.println(Sample.A); // Sample.A will be replaced by 100
    }
}