public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while (leftPointer < rightPointer) {
            if (s.charAt(leftPointer) == s.charAt(rightPointer)) {
                leftPointer++;
                rightPointer--;
            } else {
                return false;
            }
        }
        return true;
    }

}
