public class CircleArgs {
    public static void main(String[] args) {
        Double radius = Double.parseDouble(args[0]);
        Double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
