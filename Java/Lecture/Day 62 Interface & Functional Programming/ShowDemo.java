interface A {
    default void show() {
        System.out.println("Default show method of interface A");
    }
}

class B {
    public void show() {
        System.out.println("Concrete show method of class B");
    }
}

class C extends B implements A {
}

public class ShowDemo {
    public static void main(String[] args) {
        C c1 = new C();
        c1.show(); // Calls class B method
    }
}
