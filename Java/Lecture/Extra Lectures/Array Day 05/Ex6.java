// Shifting Elements To Right

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 }; // [4,5,6,7,8,1,2,3]

        System.out.println(Arrays.toString(arr));

        for (int k = 1; k <= 3; k++) {

            int x = arr[0]; // 1

            for (int i = 0; i < arr.length - 1; i++) {

                arr[i] = arr[i + 1];

            }

            arr[arr.length - 1] = x;

        }

        System.out.println(Arrays.toString(arr));

        sc.close();
    }

}
