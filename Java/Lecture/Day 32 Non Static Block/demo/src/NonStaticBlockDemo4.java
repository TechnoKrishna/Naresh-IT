class Foo {
    int x;
    {
        System.out.println("Object creation is in progress!!!");
        x = 100;
    }
}

public class NonStaticBlockDemo4 {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        System.out.println(f1.x);

        System.out.println("............");

        Foo f2 = new Foo();
        System.out.println(f2.x);
    }
}
