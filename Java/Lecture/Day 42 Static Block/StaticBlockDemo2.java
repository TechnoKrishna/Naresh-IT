// ⭐ Program 3: static variables have default values

class Foo {
    static int x;
    static {
        System.out.println("x value is :" + x);
    }
}

public class StaticBlockDemo2 {
    public static void main(String[] args) {
        new Foo();
    }
}

// Static int x → default value = 0
// Static boolean → false
// Static object → null

// So output prints default values even before assignment.