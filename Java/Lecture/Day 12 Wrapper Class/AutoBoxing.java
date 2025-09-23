public class AutoBoxing {
    public static void main(String[] args) {
        // Autoboxing (primitive → object)
        int a = 10;
        Integer obj = a; // compiler converts int → Integer

        System.out.println("Object: " + obj);
    }
}
