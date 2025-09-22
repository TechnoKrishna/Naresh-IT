// Write a program to swap two numbers without using 3rd variable using command line argument.

public class SwapWithout3rd {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        a = a + b; 
        b = a - b; 
        a = a - b; 

        System.out.println("After swapping: a = " + a + ", b = " + b);

    }
}
