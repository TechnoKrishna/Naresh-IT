import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double principle = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = 3;

        double Amount = principle * Math.pow((1 + (rate / 100)), time);

        System.out.printf("Amount after 3 years = %.1f", Amount);
    }
}
