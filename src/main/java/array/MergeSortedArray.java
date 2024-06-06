package array;

import java.util.Arrays;

/**
 * Description: Merge Sorted Array
 * You are given two integer arrays num1 and num2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in num1 and num2 respectively.
 *
 * Merge num1 and num2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be stored inside the array num1.
 * To accommodate this, num1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored.
 * num2 has a length of n.
 */
public class MergeSortedArray {

    public static void merge(int[] num1, int m, int[] num2, int n) {
        // Make a copy of the first m elements of num1.
        int[] num1Copy = new int[m];
        System.arraycopy(num1, 0, num1Copy, 0, m);

        // Two pointers to iterate through num1Copy and num2.
        int p1 = 0;
        int p2 = 0;

        // Compare elements from num1Copy and num2 and add the smallest one into num1.
        for (int p = 0; p < m + n; p++) {
            // We also need to ensure that p1 and p2 aren't over the boundaries
            // of their respective arrays.
            if (p2 >= n || (p1 < m && num1Copy[p1] < num2[p2])) {
                num1[p] = num1Copy[p1++];
            } else {
                num1[p] = num2[p2++];
            }
        }
        System.out.println(Arrays.toString(num1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
