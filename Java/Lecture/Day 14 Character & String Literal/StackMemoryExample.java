class StackMemoryExample {
    public static void main(String[] args) {
        System.out.println("Main started");
        m1();
        System.out.println("Main ended");
    }

    public static void m1() {
        int a = 10; // local variable in m1()
        System.out.println("In m1(), a = " + a);
        m2();
    }

    public static void m2() {
        int b = 20; // local variable in m2()
        System.out.println("In m2(), b = " + b);
    }
}