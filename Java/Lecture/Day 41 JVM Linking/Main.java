class Demo1 {
    static {
        x = 100; //Valid 
        System.out.println(Demo1.x); //valid 
        // System.out.println(x); //Invalid
        System.out.println("Static Block");
    }

    static int x;

    public static void m1() 
    { 
        y = 200; //Valid 
        System.out.println(y); //Valid [Here class name is not read] 
    }

    static int y;

    {
        System.out.println("Non Static Block");
    }

    Demo1() {
        System.out.println("Constructor");
        System.exit(0);
    }

}

public class Main {
    public static void main(String[] args) {
        Demo1 d =new Demo1();
        d.m1();
    }
}