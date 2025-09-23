import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input total units consumed
        System.out.print("Enter total units consumed: ");
        int units = sc.nextInt();

        double bill = 0;

        if (units <= 100) {
            bill = 160; // fixed charge
        } else if (units <= 250) {
            bill = 160 + (units - 100) * 1.0; // Rs.1 per unit after 100
        } else {
            bill = 160 + (150 * 1.0) + (units - 250) * 1.2; // Rs.1.2 per unit above 250
        }

        // Display result
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill Amount: Rs. " + bill);

        sc.close();
    }
}
