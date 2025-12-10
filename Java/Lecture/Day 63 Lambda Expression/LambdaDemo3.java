import java.util.Scanner;

interface Length {
    int getLength(String str);
}
public class LambdaDemo3 {
    public static void main(String[] args) {
        Length length = str -> str.length();

        Scanner sc = new Scanner(System.in);

        var name = sc.next();

        System.out.println(length.getLength(name));

        sc.close();
    }
}
