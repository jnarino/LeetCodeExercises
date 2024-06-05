public class ReverseWords {

    public static void main(String[] args) {

        String input = "Let's take LeetCode contest";
        System.out.println(reverseWords(input));
    }

    public static String reverseWords(String s) {

        StringBuilder result = new StringBuilder();

        String[] splitValues = s.split(" ");

        for (int i = 0; i < splitValues.length; i++) {

            char[] charArray = splitValues[i].toCharArray();
            int left = 0;
            int right = charArray.length - 1;
            char temp;
            while (left < right) {
                temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }

            result.append(charArray);
            result.append(" ");
        }

        return result.toString();

    }

}
