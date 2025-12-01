class Super {
    public static void m1() {
        System.out.println("m1 static method of super class");
    }
}

class Sub extends Super {
}

public class MethodHidingDemo1 {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.m1();
        System.out.println("...........");
        Sub.m1();
    }
}