class C {
    public C() {
        System.out.println("A class constructor");
    }
}

class D extends C { }

class E extends D {
    public E() {
        System.out.println("C class constructor");
    }
}

public class ConstructorChainingDemo2 {
    public static void main(String[] args) {
        E c1 = new E();
    }
}
