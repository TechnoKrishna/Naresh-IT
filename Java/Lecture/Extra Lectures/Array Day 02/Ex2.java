// Find Prime

public class Ex2 {

    public static void main(String[] args) {

        int arr[] = { 11, 2, 3, 4, 5, 6, 7 };

        for (int i = 0; i < arr.length; i++) {

            int c = 0;

            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    c++;
                }
            }
            if (c == 2) {
                System.out.println(arr[i]);
            }

        }

    }

}
