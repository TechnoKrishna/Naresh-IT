// ⭐ Program 1 Understanding: Static Block Won’t Execute If Class Is Not Loaded

class Foo {
    Foo() {
        System.out.println("No Argument constructor..");
    }

    {
        System.out.println("Non static Block..");
    }

    static {
        System.out.println("Static block...");
    }
}

public class StaticBlockDemo {
    public static void main(String[] args) {
        System.out.println("Main Method Executed ");
    }
}

// In the first example you wrote:
// System.out.println("Main Method Executed");
// You are not using Foo class anywhere → JVM does not load Foo.class → static
// block of Foo doesn’t run.

// 👉 Real-life Example

// A classroom has a projector.
// If no one switches it on, the projector is never initialized.

// Static block = projector initialization.
// If class is not used → "projector is never turned on".