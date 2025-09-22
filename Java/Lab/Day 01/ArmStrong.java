// Write a Java program to verify whether a number is armstrong or not where number must be taken from command line argument.

public class ArmStrong {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
