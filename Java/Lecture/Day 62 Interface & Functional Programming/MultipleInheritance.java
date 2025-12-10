interface Alpha {
    default void m1() {
        System.out.println("Alpha interface Method");
    }
}

interface Beta {
    default void m1() {
        System.out.println("Beta interface Method");
    }
}

class Implementer implements Alpha, Beta {

    @Override
    public void m1() {
        Alpha.super.m1();
        Beta.super.m1();
        System.out.println("MI is possible by using default method also");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        new Implementer().m1();
    }
}
