//package string;
//
//import java.util.Map;
//
///**
// * Given a pattern and a string s, find if s follows the same pattern.
// * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
//
// * Example 1:
// * Input: pattern = "abba", s = "dog cat cat dog"
// * Output: true
// *
// * Example 2:
// * Input: pattern = "abba", s = "dog cat cat fish"
// * Output: false
// *
// * Example 3:
// * Input: pattern = "aaaa", s = "dog cat cat dog"
// * Output: false
// */
//public class WordPattern {
//    public static void main(String[] args) {
//        String pattern = "abba";
//        String s = "dog cat cat dog";
//        System.out.println(wordPattern(pattern, s));
//    }
//
//    private static boolean wordPattern(String pattern, String s) {
//        Map<String, String>
//        if(pattern.isEmpty() || s.isEmpty())
//            return false;
//        String[] words = s.split(" ");
//        if(pattern.length() != words.length)
//            return false;
//        for (int i = 0; i < pattern.length(); i++) {
//        }
//        return true;
//    }
//}
