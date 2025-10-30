class Tests {
    public Tests() {
        x = 300;
    }

    int x = 100;

    {
        x = 200;
    }
}

public class NonStaticFieldInitializationOrder {
    public static void main(String[] args) {
        Tests t1 = new Tests();
        System.out.println(t1.x);
    }
}
