package array;

/**
 * Given an input string s, reverse the order of the words.
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 *
 * Return a string of the words in reverse order concatenated by a single space.
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 */
public class ReverseWords {

    public static void main(String[] args) {
        String s = "the sky is blue";
        String reversedString = reverseWords(s);
        System.out.println(reversedString);
    }

    private static String reverseWords(String s) {
        if(s == null || s.isEmpty()) {
            return "";
        }
        String[] words = s.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (String word : words){
            if(!word.equals("")){
                reversed.insert(0, word + " ");
            }
        }
        return reversed.toString().trim();
    }
}
