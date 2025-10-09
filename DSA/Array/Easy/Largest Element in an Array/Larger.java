class Solution {
    public int largestElement(int[] nums) {

        int element = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (element < nums[i]) {
                element = nums[i];
            }
        }

        return element;
    }
}

public class Larger {
    public static void main(String[] args) {

        // int nums[] = { 3, 3, 6, 1 };
        int nums[] = { -4, -3, 0, 1, -8 };

        Solution solution = new Solution();

        System.out.println("Output : " + solution.largestElement(nums));

    }
}
