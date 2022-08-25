package Strings;

//https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome125 {

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || Character.isDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        String str1 = sb.toString();
        String str2 = sb.reverse().toString();
        return str1.equals(str2);
    }
}
