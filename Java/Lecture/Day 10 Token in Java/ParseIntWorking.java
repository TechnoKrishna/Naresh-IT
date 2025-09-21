class Calculater // Integer
{
    public static int dosum(int x, int y) {
        return x + y;
    }
}

public class ParseIntWorking {
    public static void main(String[] args) {
        int sum = Calculater.dosum(12, 24);
        System.out.println("Sum is :" + sum);
    }
}