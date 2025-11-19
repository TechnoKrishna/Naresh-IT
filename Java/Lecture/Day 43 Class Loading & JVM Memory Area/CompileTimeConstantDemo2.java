class Foo {
    public static final int A = m1(); // It is not a compile time constant

    public static int m1() {
        return 100;
    }

    static {
        System.out.println("SB");
    }
}

public class CompileTimeConstantDemo2 {
    public static void main(String[] args) {
        System.out.println(Foo.A);
    }
}