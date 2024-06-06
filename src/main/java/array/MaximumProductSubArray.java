package array;

public class MaximumProductSubArray {

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = maxSoFar;
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            int prevMaxSoFar = maxSoFar;
            maxSoFar = Math.max(curr, Math.max(maxSoFar * curr, minSoFar * curr));
            minSoFar = Math.min(curr, Math.min(prevMaxSoFar * curr, minSoFar * curr));

            result = Math.max(maxSoFar, result);
        }
        System.out.println(result);
    }
}
