class Instance {
    private int x;

    public Instance() {
        x = 100;
        System.out.println("x value is: " + x);
    }

    {
        x = 200;
        System.out.println("x value is: " + x);
    }

    {
        x = 300;
        System.out.println("x value is: " + x);
    }

    {
        x = 400;
        System.out.println("x value is: " + x);
    }
}

public class NonStaticBlokcDemo5 {
    public static void main(String[] args) {
        Instance i = new Instance();
    }
}
