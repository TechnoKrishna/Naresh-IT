// ⭐ Program 9: Constructor can run before static block?

class Test {
    public static final Test t1 = new Test(); // t1 = null

    static {
        System.out.println("static block");
    }

    {
        System.out.println("Non static block");
    }

    Test() {
        System.out.println("No Argument Constructor");
    }
}

public class StaticBlockDemo9 {
    public static void main(String[] args) {
        new Test(); // 2 steps (class loading + Object creation)
    }
}

// Yes, in rare cases, like:

// public static final Test t1 = new Test();

// Here:

// When class loads, static variable t1 must get value
// It calls new Test()
// Constructor executes
// Only then next static blocks run