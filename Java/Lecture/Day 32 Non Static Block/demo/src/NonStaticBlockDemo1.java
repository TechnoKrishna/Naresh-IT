class Test {
    private int x;
    {
        System.out.println("Non static block demo");
    }
}

public class NonStaticBlockDemo1 {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
    }
}
