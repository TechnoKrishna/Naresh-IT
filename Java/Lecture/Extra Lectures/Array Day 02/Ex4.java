// Store First N Prime Number's Into Array

import java.util.Arrays;

public class Ex4 {

    public static int[] getPrime(int n) {
        int arr[] = new int[n];

        int x = 0;

        for (int i = 1; x < n; i++) {
            int c = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c == 2) {
                arr[x] = i;
                x++;
            }

        }
        return arr;
    }

    public static void main(String[] args) {

        int n = 5;

        int[] prime = getPrime(n);

        System.out.println(Arrays.toString(prime));

    }
}
