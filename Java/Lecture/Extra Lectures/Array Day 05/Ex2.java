import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static int[] insertEle(int arr[], int ele) {
        int brr[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i]; // [1,2,3,4,5,0]
        }
        brr[brr.length - 1] = ele;
        return brr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 5 }; // 1000x

        System.out.println("How many elements you wants to insert?");
        int n = sc.nextInt(); // 3

        System.out.println("Before : " + Arrays.toString(arr));

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            arr = insertEle(arr, x);
        }

        System.out.println("After : " + Arrays.toString(arr));

        sc.close();
    }

}
