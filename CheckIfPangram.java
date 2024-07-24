import java.util.HashSet;
import java.util.Set;

public class CheckIfPangram {

    /*
     * 1832. Check if the Sentence Is Pangram
     * Easy
     * 
     * Topics
     * 
     * Companies
     * 
     * Hint
     * A pangram is a sentence where every letter of the English alphabet appears at
     * least once.
     * 
     * Given a string sentence containing only lowercase English letters, return
     * true if sentence is a pangram, or false otherwise.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
     * Output: true
     * Explanation: sentence contains at least one of every letter of the English
     * alphabet.
     * Example 2:
     * 
     * Input: sentence = "leetcode"
     * Output: false
     * 
     * 
     * Constraints:
     * 
     * 1 <= sentence.length <= 1000
     * sentence consists of lowercase English letters.
     */

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));

    }

    public static boolean checkIfPangram(String sentence) {

        Set<Character> alphabet = new HashSet<>();
        char[] charArray = sentence.toCharArray();

        for (char value : charArray) {
            alphabet.add(value);
        }

        return alphabet.size() == 26 ? true : false;

    }
}
