// ⭐ Program 11: Calling static method sets static variable

// Static variable updated by method → accessible everywhere.

class Demo {
    public static void print() {
        x = 120;
        System.out.println("x value is :" + x);
    }

    static int x;
}

public class StaticBlockDemo11 {
    public static void main(String[] args) {
        Demo.print();
    }
}