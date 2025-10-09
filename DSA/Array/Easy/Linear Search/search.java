import java.util.Scanner;

public class search {

    public int linearSearch(int nums[], int target) {

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        // int nums[] = { 2, 3, 4, 5, 3 };
        int nums[] = { 2, -4, 4, 0, 10 };
        Scanner sc = new Scanner(System.in);
        search s = new search();
        int target = sc.nextInt();
        int index = s.linearSearch(nums, target);
        if (index < 0) {
            System.out.println("The value " + target + " does not occur in the array, hence output is " + index);
        } else {
            System.out.println("The First Occurence of " + target + " in nums is at " + index);
        }
        sc.close();

    }
}
