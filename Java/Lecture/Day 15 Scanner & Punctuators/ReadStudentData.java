import java.util.Scanner;

public class ReadStudentData {
    public static void main(String[] args) {

        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Read roll number (integer)
        System.out.print("Enter your roll: ");
        int roll = Integer.parseInt(sc.nextLine()); // Converts String to int

        // Read name (String)
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        // Read fees (double)
        System.out.print("Enter your fees: ");
        double fees = Double.parseDouble(sc.nextLine()); // Converts String to double

        // Display the student data
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll number: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Fees: " + fees);

        // Close the Scanner object
        sc.close();
    }
}