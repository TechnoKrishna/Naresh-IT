// ⭐ Program 4: static blank final also has default value

class Demo {
    final static int a; // static Blank final field

    static {
        m1();
        a = 100;
        System.out.println("User Value :" + a);
    }

    public static void m1() {
        System.out.println("Default Value :" + a);
    }
}

public class StaticBlockDemo3 {
    public static void main(String[] args) {
        System.out.println("a value is :" + Demo.a);
    }
}

// final static int a; // blank final
// ✔ JVM gives default value (0) during prepare phase
// ✔ Then static block assigns value in initialization phase