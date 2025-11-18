// ⭐ Program 2: Multiple Static Blocks Execute Top to Bottom

class Test {
    static int x;
    static {
        x = 100;
        System.out.println("x value is :" + x);
    }
    static {
        x = 200;
        System.out.println("x value is :" + x);
    }
    static {
        x = 300;
        System.out.println("x value is :" + x);
    }
}

public class StaticBlockDemo1 {
    public static void main(String[] args) {
        System.out.println("Main Method");
        System.out.println(Test.x);
    }
}

// If a class has many static blocks:

// static { }
// static { }
// static { }

// Order = top → bottom
// Why?
// Because JVM loads the class line-by-line during class initialization.