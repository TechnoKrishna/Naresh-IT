class Instances {
    private int x;

    public Instances() {
        x = 100;
        System.out.println("x value is: " + x);
        return; // ✅ allowed here
    }

    {
        System.out.println("NSB");
        // return; // ❌ not allowed
    }
}

public class NonStaticBlokcDemo5s {
    public static void main(String[] args) {
        Instances i = new Instances();
    }
}
