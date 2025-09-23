public class TvShop {
    public static void main(String[] args) {

        int cp = 32500;
        int sp = 27;
        int gst = 0;
        int profit = 0;
        int Total = 0;

        profit = (int) (0.27 * cp);

        sp = cp + profit;

        gst = (int) (0.05 * sp);

        Total = gst + sp;

        System.out.println("Cost Price is : " + cp);
        System.out.println("Profit is : " + profit);
        System.out.println("Selling Price is : " + sp);
        System.out.println("Gst is : " + gst);
        System.out.println("Total Price is : " + Total);

    }
}
