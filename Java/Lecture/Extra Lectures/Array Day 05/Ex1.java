// Inserting Single Element by Copying array logic

import java.util.Arrays;

public class Ex1 {
    public static int[] insertEle(int arr[], int ele) {
        int brr[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i]; // [1,2,3,4,5,0]
        }
        brr[brr.length - 1] = ele;
        return brr;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 }; // 1000x
        int ele = 100;
        System.out.println("Before : " + Arrays.toString(arr));
        arr = insertEle(arr, ele);
        System.out.println("After : " + Arrays.toString(arr));
    }

}
