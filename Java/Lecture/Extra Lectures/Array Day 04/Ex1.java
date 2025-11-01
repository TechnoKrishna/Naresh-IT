// Linear Search

public class Ex1 {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 4, 6, 8, 1, 4 };
        int ele = 6;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                System.out.println("Found at index " + i);
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Not Found");
        }
    }
}
