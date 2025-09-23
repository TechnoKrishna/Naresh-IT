public class Var {
    public static void main(String[] args) {
        var x = 12; // x is int
        System.out.println(x);

        x = 90; // valid, still int
        System.out.println(x);

        // x = 90.89; // ❌ Invalid, x is int not double

        var name = "Krishna"; // name is String
        System.out.println(name);

        var pi = 3.14159; // pi is double
        System.out.println(pi);

        var flag = true; // flag is boolean
        System.out.println(flag);
    }
}
 