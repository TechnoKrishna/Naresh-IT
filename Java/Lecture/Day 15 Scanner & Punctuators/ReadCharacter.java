import java.util.Scanner;

public class ReadCharacter {
    public static void main(String[] args) {

        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter their gender
        System.out.print("Enter your Gender [M/F] : ");

        // Read the first character entered by the user
        char gender = sc.next().charAt(0);

        // Print the entered gender
        System.out.println("Your Gender is: " + gender);

        // Close the Scanner object
        sc.close();
    }
}