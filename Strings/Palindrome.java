package Strings;

public class Palindrome {

    public static void main(String[] args) {
        String str = "aabbaa";
        System.out.println(isPalindrome(str));

        str = "";
        System.out.println(isPalindrome(str));

        str = "a";
        System.out.println(isPalindrome(str));

        str = "ab";
        System.out.println(isPalindrome(str));

        str = "abcdcba";
        System.out.println(isPalindrome2(str));

        str = "abbaa";
        System.out.println(isPalindrome2(str));

        str = null;
        System.out.println(isPalindrome2(str));
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return true;

        int i = 0;
        int j = str.length() - 1;

        while (i < str.length() / 2) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindrome2(String str) {
        if (str == null) return true;

        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()- 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
