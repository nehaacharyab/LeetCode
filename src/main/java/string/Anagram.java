package string;

public class Anagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    private static boolean isAnagram(String s, String t) {
        if(s.isEmpty() || t.isEmpty())
            return false;
        if(s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            if(!t.contains(String.valueOf(s.charAt(i))))
                return false;
        }
        return true;
    }
}
