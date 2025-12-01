class Bird {
    protected static double height = 2.2;

    public static void fly() {
        System.out.println("Generic Bird is flying");
    }
}

class Parrot extends Bird {
    protected static double height = 1.2;

    public static void fly() { // Method Hiding
        System.out.println("Parrot Bird is flying");
    }
}

class Sparrow extends Bird {
    protected static double height = 1.0;

    public static void fly() { // Method Hiding
        System.out.println("Sparrow Bird is flying");
    }
}

public class MethodHidingExample1 {
    public static void main(String[] args) {
        Bird bird = new Sparrow();
        System.out.println("Height is: " + bird.height);
        bird.fly();
    }
}