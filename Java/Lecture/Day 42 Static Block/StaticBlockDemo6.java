// ⭐ Program 6: Illegal Forward Reference

class Demo {
    static {
        i = 100;
        // System.out.println(i); //Illegal forward reference
        System.out.println(Demo.i);
    }

    static int i;
}

public class StaticBlockDemo6 {
    public static void main(String[] args) {
        System.out.println(Demo.i);
    }
}

// -----------------------------------------------------------------

// static
// {
// i=100; // allowed
// System.out.println(i); // NOT allowed
// }

// static int i;

// Reason:

// Assignment to static variable BEFORE declaration is allowed (prepare phase)
// But reading the variable before JVM "knows" its existence is illegal.

// Real-life Example

// You can tell someone to set a future date for a meeting (assignment allowed),
// but you cannot read details about that meeting before it is created (access
// not allowed).