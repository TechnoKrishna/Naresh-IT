class A {
    public A() {
        System.out.println("A class Constructor");
    }
}

class B extends A {
    public B() {
        System.out.println("B class Constructor");
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        B b1 = new B();
    }
}
