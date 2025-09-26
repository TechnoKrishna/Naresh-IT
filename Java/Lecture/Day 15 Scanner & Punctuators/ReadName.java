import java.util.Scanner;

public class ReadName {
    public static void main(String[] args) {
        
        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to enter their name
        System.out.print("Enter your Name: ");
        
        // Read full line (name may contain spaces)
        String name = sc.nextLine();
        
        // Print the entered name
        System.out.println("Your Name is: " + name);
        
        // Close the Scanner object
        sc.close();
    }
}