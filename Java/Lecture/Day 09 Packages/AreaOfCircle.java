public class AreaOfCircle {

    public static void main(String[] args) {
        final double PI = 3.14;
        double radius = Double.parseDouble(args[0]);

        double areaOfCircle = PI * radius * radius;

        System.out.println("Area of Circle is :" + areaOfCircle);
    }
}