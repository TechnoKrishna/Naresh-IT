// Count Digit's

public class Ex5 {
    public static void main(String[] args) {

        long arr[] = { 545, 455455, 855, 4 };

        for (int i = 0; i < arr.length; i++) {

            long n = arr[i];

            int c = 0;

            while (n != 0) {
                c++;
                n = n / 10;
            }
            System.out.println(arr[i] + "=" + c);
        }
    }
}
