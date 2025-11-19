class Test {
    private static int x;

    public Test(int x) {
        this.x = x;
    }

    public static void print() {
        System.out.println("x value is :" + x);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Test t1 = new Test(100);
        Test.print();
    }
}