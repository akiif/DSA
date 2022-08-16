package Strings;

//https://leetcode.com/problems/reverse-string/

public class ReverseString344 {
    public void reverseString(char[] s) {
        int right = s.length - 1;
        int left = 0;
        int temp;
        while (left <= right) {
            temp = s[right];
            s[right] = s[left];
            s[left] = (char) temp;
            left++;
            right--;
        }
    }
}
