// Find Minimum & Maximum Element in an Array.
// Input as: 6 3 2 1 5 5 4
// Output as: 
// Min is: 1
// Max is: 6

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {

        int arr[] = { 6, 3, 2, 1, 5, 5, 4 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Min is: " + arr[0]);
        System.out.println("Max is: " + arr[arr.length - 1]);
    }

}
