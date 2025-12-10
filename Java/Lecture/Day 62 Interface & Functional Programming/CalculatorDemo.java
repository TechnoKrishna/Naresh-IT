import java.util.Scanner;

interface Calculate {
    static double doSum(int x, int y) {
        return (x + y);
    }

    static double getCube(int num) {
        return (num * num * num);
    }
}

public class CalculatorDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number: ");
        var num1 = Integer.parseInt(sc.next());
        System.out.println("Enter second Number: ");
        var num2 = Integer.parseInt(sc.next());

        double sum = Calculate.doSum(num1, num2);
        System.out.println("Sum is: " + sum);

        double cube = Calculate.getCube(5);
        System.out.println("Cube is: " + cube);

        sc.close();
    }
}
