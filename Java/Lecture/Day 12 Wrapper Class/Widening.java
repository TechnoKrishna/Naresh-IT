public class Widening {
    public static void main(String[] args) {
        byte b = 125;
        short s = b; // ✅ Widening (byte → short)
        System.out.println(s);

        short x = 345;
        int y = x; // ✅ Widening (short → int)
        System.out.println(y);
    }
}