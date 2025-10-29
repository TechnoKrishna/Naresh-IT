public class PassByValueDemo3 {
    public static void main(String[] args) {
        String str = new String("Java");
        System.out.println(str);

        accept(str);
        System.out.println(str);
    }

    public static void accept(String s1) {
        s1 = "Advanced Java"; // Strings are immutable (Un-changed)
    }
}