class Demos {
    public Demos() {
        this(10);
        System.out.println("No Argument constructor");
    }

    public Demos(int x) {
        System.out.println("Parameterized constructor");
    }

    {
        System.out.println("Non static block");
    }
}

public class NonStaticBlockDemo2s {
    public static void main(String[] args) {
        Demos d1 = new Demos();
    }
}
