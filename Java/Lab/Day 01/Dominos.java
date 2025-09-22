public class Dominos {

    public static void main(String[] args) {

        int p1 = 60;
        int p2 = 25;

        int item1 = Integer.parseInt(args[0]);
        int item2 = Integer.parseInt(args[1]);

        int TotalAmount = 0;

        TotalAmount = ((p1 * item1) + (p2 * item2)) - 50;

        System.out.println("Total Amount: " + TotalAmount);

    }

}
