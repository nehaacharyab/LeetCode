package string;

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.
 * Example 1:
 *
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 *
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 *
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */
public class RansomeNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.isEmpty() || magazine.isEmpty())
            return false;
        if(ransomNote.length() > magazine.length())
            return false;
        for (int i = 0; i < ransomNote.length(); i++) {
            if(!magazine.contains(String.valueOf(ransomNote.charAt(i))))
                return false;
            magazine = magazine.replaceFirst(String.valueOf(ransomNote.charAt(i)), "");
        }
        return true;
    }
}
