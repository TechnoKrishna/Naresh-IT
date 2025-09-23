public class Conversion {
    public static void main(String[] args) {
        int x = 2781;
        System.out.println("Decimal " + x + " in Hexadecimal: " + Integer.toHexString(x));

        int y = 17;
        System.out.println("Decimal " + y + " in Octal: " + Integer.toOctalString(y));

        int z = 7;
        System.out.println("Decimal " + z + " in Binary: " + Integer.toBinaryString(z));
    }
} 