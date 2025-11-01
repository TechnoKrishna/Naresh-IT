import java.util.Arrays;

public class Ex2 {

    public static void sortArray(int brr[]) {
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr.length - i - 1; j++) {
                if (brr[j] > brr[j + 1]) {
                    int t = brr[j];
                    brr[j] = brr[j + 1];
                    brr[j + 1] = t;
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = { 7, 1, 2, 5, 3, 6, 4 };
        System.out.println("Before Sort : " + Arrays.toString(arr));
        Ex2.sortArray(arr);
        System.out.println("After sort :" + Arrays.toString(arr));
    }
}
