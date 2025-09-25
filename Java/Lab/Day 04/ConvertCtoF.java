import java.util.Scanner;

public class ConvertCtoF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double C = sc.nextDouble();

        double F = (9 * (C / 5) + 32);

        System.out.printf("Fahrenheit = %.1f", F);

    }
}
