import java.util.Scanner;

public class CurvedSurfaceArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int side = sc.nextInt();

        if (side >= 1 && side <= 1000) {
            int CSA = 6 * (side * side);
            System.out.println("Curved Surface Area = " + CSA);
        } else {
            System.out.println("Invalid Input");
        }

    }
}
