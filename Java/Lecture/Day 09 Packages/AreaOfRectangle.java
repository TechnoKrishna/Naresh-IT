public class AreaOfRectangle {

    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        int breadth = Integer.parseInt(args[1]); 

        int areaOfRect = length * breadth;
        System.out.println("Area of Rectangle is :" + areaOfRect);
    }

}