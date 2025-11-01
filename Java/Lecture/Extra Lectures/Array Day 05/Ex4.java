// Delete Element By Copying One Array To Another Array by skiping deleting element.

import java.util.Arrays;

public class Ex4 {

    public static int[] deleteEle(int arr[], int ele) {

        int c = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                c++;
            }
        }

        int brr[] = new int[arr.length - c];

        int x = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ele) {
                brr[x++] = arr[i]; // []
            }
        }
        return brr;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 3, 5, 3 }; // [1,2,4,5,5]

        System.out.println("Before: " + Arrays.toString(arr));

        arr = deleteEle(arr, 3);

        System.out.println("After: " + Arrays.toString(arr));

    }

}
