// Inserting Multiple Element by Arrays.copyOf() Method

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static int[] insertEle(int arr[], int ele) {
        int[] brr = Arrays.copyOf(arr, arr.length + 1);
        brr[brr.length - 1] = ele;
        return brr;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println("How many elements you wants to insert?");
        int n = sc.nextInt();

        System.out.println("Before :" + Arrays.toString(arr));
        
        for (int i = 1; i <= n; i++) {
            arr = insertEle(arr, sc.nextInt());
        }

        System.out.println("After : " + Arrays.toString(arr));

        sc.close();
    }
}
