class Addition {

    public int doSum(int x, int y) {
        return (x + y);
    }

    protected double doSum(double x, double y) {
        return (x + y);
    }

    public String doSum(String x, String y) {
        return (x + y);
    }
}

public class MOLDemo1 {
    public static void main(String[] args) {

        Addition addition = new Addition();

        System.out.println("Sum of two integers: " + addition.doSum(12, 24));
        System.out.println("Sum of two doubles: " + addition.doSum(1.2, 2.4));
        System.out.println("Concatenation of Strings: " + addition.doSum("Data", "base"));
    }
}