interface Alpha {
    public static void m1() {
        System.out.println("Static Method");
    }
}

class Beta implements Alpha {
}

public class StaticMethodDemo2 {
    public static void main(String[] args) {
        // Beta.m1(); // error
        // new Beta().m1(); // error
        Alpha.m1(); // Correct
    }
}
