package Strings;

//https://leetcode.com/problems/implement-strstr/

public class ImplementstrStr28 {

    public int strStr(String haystack, String needle) {
        int index = -1;
        int n =  haystack.length();
        String str = "";
        for (int i = 0; i <= n - 1; i++) {
            for (int j = n; j >= i; j--) {
                str = haystack.substring(i, j);
                if (str.equals(needle)) {
                    index = i;
                    return index;
                }
            }
        }
        return index;
    }
}
