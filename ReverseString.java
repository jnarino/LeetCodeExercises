public class ReverseString {

    public static void main(String[] args) {

        char[] s = "hello".toCharArray();

        System.out.println(s);

        reverseString(s);
        System.out.println();

    }

    public static void reverseString(char[] s) {

        int leftPointer = 0;
        int rightPointer = s.length - 1;

        while (leftPointer < rightPointer) {
            char temp;
            temp = s[leftPointer];
            s[leftPointer] = s[rightPointer];
            s[rightPointer] = temp;
            leftPointer++;
            rightPointer--;

        }
        System.out.println("after");

        System.out.println(s);

    }

}
