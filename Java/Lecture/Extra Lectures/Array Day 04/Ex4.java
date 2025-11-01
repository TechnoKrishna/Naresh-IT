// Count and Print Distinct Elements.
// Write a program to count the number of distinct/unique/non repeated
// elements in an array {1, 2, 2, 3, 4, 4, 5} and print those unique elements.

public class Ex4 {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 3, 4, 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    c++; // 1
                }
            }
            if (c == 1) {
                System.out.println(arr[i]); // 1 3 5
            }
        }

    }

}
