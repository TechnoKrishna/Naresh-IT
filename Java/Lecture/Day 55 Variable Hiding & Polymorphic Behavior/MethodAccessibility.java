class Super {
    @SuppressWarnings("unused")
    private void m1() {
        System.out.println("M1 method in super class");
    }
}

class Sub extends Super {
    public void m1() { // Method Re-declaration
        System.out.println("M1 method in Sub class");
    }
}

public class MethodAccessibility {
    public static void main(String[] args) {
        new Sub().m1();
    }
}