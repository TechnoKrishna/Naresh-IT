public class MethodChaining1 {

    public static void main(String[] args) {
        String str = "INDIA";
        char ch = str.concat(" is great ").toLowerCase().charAt(1);
        System.out.println(ch);

    }
}