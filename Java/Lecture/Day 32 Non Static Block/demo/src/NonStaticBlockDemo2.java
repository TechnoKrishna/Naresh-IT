class Demo {
    public Demo() {
        System.out.println("No Argument constructor");
    }

    public Demo(int x) {
        System.out.println("Parameterized constructor");
    }

    {
        System.out.println("Non static block");
    }
}

public class NonStaticBlockDemo2 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo(100);
    }
}
