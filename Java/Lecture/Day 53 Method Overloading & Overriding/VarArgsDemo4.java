class Sample {

    public void accept(int x, int... y) {
        System.out.println("x value is: " + x);

        for (int z : y) {
            System.out.println(z);
        }
    }
}

public class VarArgsDemo4 {
    public static void main(String... args) {
        Sample s1 = new Sample();
        s1.accept(12, 10, 20, 30, 40, 50);
    }
}
