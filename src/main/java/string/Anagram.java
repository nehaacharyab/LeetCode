package string;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    static boolean isAnagram(String s, String t) {
        if(s.isEmpty() || t.isEmpty())
            return false;
        if(s.length() != t.length())
            return false;
        var sCharArray = s.toCharArray();
        var tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        String sSortedAnagram = String.valueOf(sCharArray);
        String tSortedAnagram = String.valueOf(tCharArray);
        if(!sSortedAnagram.equals(tSortedAnagram)){
            return false;
        }
        return true;
    }
}
