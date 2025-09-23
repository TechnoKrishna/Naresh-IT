public class UnBoxing {
    public static void main(String[] args) {
        // Unboxing (object → primitive)
        Integer num = 20;
        int b = num; // compiler converts Integer → int
        System.out.println("Primitive: " + b);
    }
} 