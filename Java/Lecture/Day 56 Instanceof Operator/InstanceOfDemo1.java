public class InstanceOfDemo1 {
    public static void main(String[] args) {
        InstanceOfDemo1 t1 = new InstanceOfDemo1();

        if (t1 instanceof InstanceOfDemo1) {
            System.out.println("t1 is pointing to Test Object");
        }
    }
}