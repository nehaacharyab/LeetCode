package array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j
 * in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * <p>
 * Example 2:
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * <p>
 * Example 3:
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] array = {1,2,3,1,2,3};
        System.out.println(containsDuplicate(array));
    }

    private static int containsDuplicate(int[] array){
        Map<Integer, Integer> containsMap = new HashMap<>();
        for(int i =0; i<= array.length ; i ++){
            if(containsMap.containsKey(array[i])){
                return containsMap.get(array[i]);
            }
            else{
                containsMap.put(array[i],  1 );
            }
        }
        return -1;
    }
}
