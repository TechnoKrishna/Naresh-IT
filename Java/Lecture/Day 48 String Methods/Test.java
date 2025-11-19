public class Test {
    public static void main(String[] args) {

        String str = "Java is a platform independent language";
        boolean isAvailable = str.contains("independent");
        System.out.println("Is Avilable:" + isAvailable);

        System.out.println(".........................");

        isAvailable = str.contains("Python");
        System.out.println("Is Avilable:" + isAvailable);

    }
}