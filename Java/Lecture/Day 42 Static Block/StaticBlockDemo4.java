// ⭐ Program 5: Order of execution (Inheritance)

// For:

// Class A
// Class B extends A
// new B()

class A // [ADBCEF]
{

    static {
        System.out.println("A");
    }

    {
        System.out.println("B");
    }

    A() {
        System.out.println("C");
    }

}

class B extends A {

    static {
        System.out.println("D");
    }

    {
        System.out.println("E");
    }

    B() {
        System.out.println("F");
    }
}

public class StaticBlockDemo4 {
    public static void main(String[] args) {
        new B(); // class Loading + Object Creation
    }
}

// Execution order:

// 1️⃣ Load A → run A's static block
// 2️⃣ Load B → run B's static block
// 3️⃣ Create object B
// 4️⃣ A’s instance block
// 5️⃣ A’s constructor
// 6️⃣ B’s instance block
// 7️⃣ B’s constructor

// Real-life Example

// Imagine:

// A = Father
// B = Son

// Before a son is born:
// Father (A class) is created first
// Then son (B class)

// Before a son's constructor runs, the father’s responsibilities run first.