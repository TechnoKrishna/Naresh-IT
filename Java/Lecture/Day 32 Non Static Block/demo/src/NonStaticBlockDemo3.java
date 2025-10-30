class Sample {
    public Sample() {
        System.out.println("No Argument Constructor");
    }

    {
        System.out.println("Non static block");
    }
}

public class NonStaticBlockDemo3 {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        System.out.println(".............");
        Sample s2 = new Sample();
    }
}
