// Working With Arrays.hashCode(),Arrays.equals() methods

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 5 };
        int brr[] = { 1, 2, 3, 4, 5 };

        System.out.println(arr == brr);

        System.out.println(Arrays.hashCode(arr));
        System.out.println(Arrays.hashCode(brr));

        System.out.println(arr.hashCode());
        System.out.println(brr.hashCode());

        System.out.println(System.identityHashCode(arr));
        System.out.println(System.identityHashCode(brr));

        System.out.println(Arrays.equals(arr, brr));

        sc.close();

    }

}
