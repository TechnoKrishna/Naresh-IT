import java.util.Scanner;

public class WholeSeller {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double NetBill = sc.nextDouble();
        Double Dr;
        Double Da;
        Double Ap;

        if (NetBill < 5000) {
            Dr = 0.05;
            Da = Dr * NetBill;
            Ap = NetBill - Da;
            System.out.println(
                    "Discount Rate : 5" + "% " + "Discount Amount : " + Da + " Amount Payable : " + Ap);
        } else if (NetBill >= 5000 && NetBill < 10000) {
            Dr = 0.10;
            Da = Dr * NetBill;
            Ap = NetBill - Da;
            System.out.println(
                    "Discount Rate : 10" + "% " + "Discount Amount : " + Da + " Amount Payable : " + Ap);
        } else {
            Dr = 0.15;
            Da = Dr * NetBill;
            Ap = NetBill - Da;
            System.out.println(
                    "Discount Rate : 15" + "% " + "Discount Amount : " + Da + " Amount Payable : " + Ap);
        }

    }
}
