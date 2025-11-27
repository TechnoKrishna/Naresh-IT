class Addition {
    public void sumOfParameter(int... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        System.out.println("Sum of parameter is: " + sum);
    }
}

public class VarArgsDemo3 {
    public static void main(String[] args) {
        Addition a = new Addition();
        a.sumOfParameter(1, 2, 3, 4, 5);
    }
}
