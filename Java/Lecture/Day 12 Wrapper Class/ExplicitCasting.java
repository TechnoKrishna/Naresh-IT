public class ExplicitCasting {
    public static void main(String[] args) {
        byte x = (byte) 18L; // long → byte
        System.out.println("x value = " + x);

        long l = 29L; // ✅ valid long
        System.out.println("l value = " + l);

        int y = (int) 1L; // long → int (needs cast, but safe here)
        System.out.println("y value = " + y);
    }
}