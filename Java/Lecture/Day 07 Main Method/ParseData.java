public class ParseData {
    public static void main(String[] args) {
        String ageStr = args[0]; // input as String
        int age = Integer.parseInt(ageStr); // convert to int
        System.out.println("You are " + age + " years old.");
    }
}