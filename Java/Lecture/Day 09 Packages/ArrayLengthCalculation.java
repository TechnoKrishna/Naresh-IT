public class ArrayLengthCalculation {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Array Length is 0");
        } else if (args.length == 1) {
            int num = Integer.parseInt(args[0]);
            System.out.println("Cube of " + num + " is :" + (num * num * num));
        } else if (args.length == 2) {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int sum = x + y;
            System.out.println("Sum is :" + sum);
        }
    }
}