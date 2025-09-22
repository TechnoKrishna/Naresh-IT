// Write a program in java to Fahrenheit to Celsius Program Formula is :-  celsius=((fahrenheit-32)*5)/9;

public class FtoC {

    public static void main(String[] args) {
        double fahrenheit = Double.parseDouble(args[0]);

        double celsius = ((fahrenheit - 32) * 5) / 9;

        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");
    }

}
