public class SumOfNumbers {
    public static void main(String[] args) {

        int Total = 0;

        for (String string : args) {
            Total += Integer.parseInt(string);  
        }

        System.out.println("Sum Of Numbers : " + Total);
        
    }
}
