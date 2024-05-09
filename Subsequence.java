public class Subsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        int resultSize = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                System.out.println("analizando letra en s: " + s.charAt(i));
                System.out.println("analizando letra en t: " + t.charAt(j));
                i++;
                j++;
                resultSize++;
            } else {
                System.out.println("entra al else");
                j++;
            }

        }

        System.out.println(resultSize);

        return resultSize == s.length() ? true : false;
    }

}
