import java.util.HashMap;
import java.util.Map;

public class FirstLetterToAppearTwice {
    // 2351

    public static void main(String[] args) {

        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));

    }

    public static char repeatedCharacter(String s) {

        Map<Character, Integer> values = new HashMap<>();
        char[] charArray = s.toCharArray();
        values.put(charArray[0], 0);
        for (int i = 1; i < charArray.length; i++) {
            if (values.containsKey(charArray[i])) {
                return charArray[i];
            }
            values.put(charArray[i], i);

        }

        return ' ';

    }

}
