package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static string.Anagram.isAnagram;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 *
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        var map = new HashMap<String, ArrayList<String>>();
        for (String str : strs){
            var charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = String.valueOf(charArray);
            if(map.containsKey(sortedString)){
                map.get(sortedString).add(str);
            }
            else {
                var list = new ArrayList<String>();
                list.add(str);
                map.put(sortedString, list);
            }
        }
        System.out.println(new ArrayList<>(map.values()));
    }
}
