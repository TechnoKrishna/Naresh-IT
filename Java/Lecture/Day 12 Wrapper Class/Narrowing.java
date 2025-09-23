public class Narrowing {
    public static void main(String[] args) {
        short s = 127;
        byte b = (byte) s; // ✅ Explicit narrowing
        System.out.println(b);
    }
} 