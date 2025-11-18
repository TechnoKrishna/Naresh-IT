// ⭐ Program 8: Static blank final field

// Static final blank fields must be given a value exactly once, inside static block.

public class StaticBlockDemo8 {
    final static int x; // Blank static final field

    static {
        m1();
        x = 15;
    }

    public static void m1() {
        System.out.println("Default value of x is : " + x);
    }

    public static void main(String[] args) {
        System.out.println("After initialization: " + StaticBlockDemo8.x);
    }
}