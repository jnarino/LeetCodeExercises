public class ReversePrefix {
    public static void main(String[] args) {

        String word = "abcdefd", word2 = "xyxzxe";
        char ch = 'd', ch2 = 'z';
        System.out.println(reversePrefix(word, ch));
    }

    public static String reversePrefix(String word, char ch) {
        char tempValue;
        char[] charArray = word.toCharArray();
        int firstOccurrencePointer = 0;
        int leftPointer = 0;
        while (firstOccurrencePointer < charArray.length && charArray[firstOccurrencePointer] != ch) {
            firstOccurrencePointer++;
        }
        
        if (firstOccurrencePointer == charArray.length) {
            return word;
        }

        while (leftPointer <= firstOccurrencePointer) {
            tempValue = charArray[leftPointer];
            charArray[leftPointer] = charArray[firstOccurrencePointer];
            charArray[firstOccurrencePointer] = tempValue;
            firstOccurrencePointer--;
            leftPointer++;

        }

        return new String(charArray);
    }

}
