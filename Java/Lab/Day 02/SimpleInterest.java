import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle : ");
        int Principle = sc.nextInt();
        System.out.print("\nEnter Rate : ");
        int Rate = sc.nextInt();
        System.out.print("\nEnter Time : ");
        int Time = sc.nextInt();

        int SI = (Principle * Rate * Time) / 100;

        int Amount = Principle + SI;

        System.out.println("Simple Interest : " + SI);
        System.out.println("Amount : " + Amount);
    }
}
