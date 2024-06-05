public class ReverseOnlyLetters {

    public static void main(String[] args) {

        String s = "a-bC-dEf-ghIj";
        String s2 = "ab-cd";
        String s3 = "Test1ng-Leet=code-Q!";
        String s4 = "7_28]";
        System.out.println(s);
        reverseOnlyLetters(s);
        System.out.println(s2);
        reverseOnlyLetters(s2);
        System.out.println(s3);
        reverseOnlyLetters(s3);
        System.out.println(s4);
        reverseOnlyLetters(s4);

    }

    public static String reverseOnlyLetters(String s) {
        char[] message = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;
        char temp;
        while (left < right) {

            if ((Character.isLetter(message[left])) && (Character.isLetter(message[right]))) {
                temp = message[left];
                message[left] = message[right];
                message[right] = temp;
                left++;
                right--;
            } else if ((Character.isLetter(message[left])) && !(Character.isLetter(message[right]))) {
                right--;

            } else if (!(Character.isLetter(message[left])) && (Character.isLetter(message[right]))) {
                left++;
            } else if (!(Character.isLetter(message[left])) && !(Character.isLetter(message[right]))) {
                left++;
                right--;
            }

        }

        System.out.println(message);

        return message.toString();

    }

}
