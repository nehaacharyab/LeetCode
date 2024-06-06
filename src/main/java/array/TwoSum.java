package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {3, 9, 11, 12, 17, 21};
        int t = 26;
        int[] twoSumArray = twoSum(arr, t);
        System.out.println(Arrays.toString(twoSumArray));
    }

    private static int[] twoSum(int[] arr, int t) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = t - arr[i];
            if(integerMap.containsKey(complement)){
                return new int[]{integerMap.get(complement), i};
            }
            else
                integerMap.put(arr[i], i);
        }
        return new int[0];
    }
}
