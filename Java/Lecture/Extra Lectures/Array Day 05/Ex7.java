// Missing Elemets From Array

import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 2, 10, 9, 5 }; // 3 4 6 7 8

        Arrays.sort(arr); // [2,5,9,10]

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = arr[i] + 1; j < arr[i + 1]; j++) {

                System.out.print(j + " ");// 3 4 6 7 8
                
            }
        }

        sc.close();

    }

}
