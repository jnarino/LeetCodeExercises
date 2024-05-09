public class LengthOfLastWord {

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("Hello World"));

    }

    public static int lengthOfLastWord(String s) {
        String[] data = s.split(" ");
        System.out.println(data[data.length - 1]);
        return data[data.length - 1].length();
    }

}
