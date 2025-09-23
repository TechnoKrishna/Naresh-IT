public class Cycle {

    public static void main(String[] args) {

        int cp = 1200;

        int repairs = 250, color = 350, accessories = 500;

        int spending = repairs + color + accessories;

        int total_spending = cp + spending;

        int sp = total_spending + 1500;

        System.out.println("Spending : " + spending);
        System.out.println("Total Spending : " + total_spending);
        System.out.println("Selling Price : " + sp);

    }
}
