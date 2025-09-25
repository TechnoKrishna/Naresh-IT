import java.util.Scanner;

public class CylinderTSA {
    public static void main(String[] args) {
        final double PI = 3.14;

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int h = sc.nextInt();

        // Formula: TSA = 2 * π * r^2 + 2 * π * r * h
        double tsa = 2 * PI * r * r + 2 * PI * r * h;

        // Output the result
        System.out.printf("Total Surface Area = %.1f", tsa);

        sc.close();
    }
}
