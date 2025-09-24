public class CommandLineOperations {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No arguments provided!");
        } else if (args.length == 1) {
            int no = Integer.parseInt(args[0]);
            System.out.println("Square of the Number is : " + (no * no));
        } else if (args.length == 2) {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[0]);
            System.out.println("Sum of the Number is : " + (n1 + n2));
        } else if (args.length > 2) {
            int Total = 0;
            for (String string : args) {
                Total += Integer.parseInt(string);
            }
            System.out.println("Sum of Total No is : " + Total);
        } else {
            System.out.println("Invalid Number");
        }

    }
}
