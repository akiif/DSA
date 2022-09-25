package Recursion.Strings;

/*
Q: You are given a string, and you have to create another string that has removed all the a's from it.
str = baccad, ans = bccd
Time Complexity = O(N), where N is the size of the string
*/

import java.util.Objects;

public class SkipACharacter {
    public static void main(String[] args) {
        String str = "baccad";
        String ans = skipACharacter1(str, "");
        System.out.println(ans);

        skip("", str);

        str = "chdaiabcad";
        System.out.println(skipACharacter2(str));
        System.out.println(skipReturn(str));
    }

    // Approach 1: Pass the answer string in argument
    static String skipACharacter1 (String str, String ans) {
        if (str.isEmpty()) {
            return ans;
        }

        char ch = str.charAt(0);

        if (str.charAt(0) != 'a') {
            ans += ch;
        }

        // remove the first element from str
        str = str.substring(1);

        return skipACharacter1(str, ans);
    }

    // p -> processed, up -> unprocessed
    static void skip (String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    // Approach 2: Create the answer variable in function.
    static String skipACharacter2 (String str) {

        if (str.isEmpty()) {
            return "";
        }
        String ans = "";
        char ch = str.charAt(0);

        if (str.charAt(0) != 'a') {
            ans += ch;
        }

        str = str.substring(1);

        return ans + skipACharacter2(str);
    }

    static String skipReturn (String up) {
        if (up.isEmpty()) {
            return "";
        }
        String ans = "";
        char ch = up.charAt(0);

        if (ch != 'a') {
            ans += ch;
        }

        return ans + skipReturn(up.substring(1));
    }
}
