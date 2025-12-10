interface A {
    int x = 100;
}

abstract class B {
    int x = 200;
}

class C extends B implements A {
    int x = 300; // Variable Hiding

    public void show() {
        System.out.println(x);
    }
}

public class VariableHiding {
    public static void main(String[] args) {
        new C().show();
    }
}
