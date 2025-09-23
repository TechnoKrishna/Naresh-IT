import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Days : ");
        int day = sc.nextInt();

        System.out.println(day%365);
        int years = day / 365;
        int months = (day % 365) / 30;
        int days = ((day % 365) % 30);

        System.out.println("Years : " + years + " Months : " + months + " Days : " + days);

    }
}
