package Recursion.Subset;

/*
Q: Find all the subsets of a given string
Example:
str = "abc"
ans = ["a", "b", "c", "ab", "ac", "bc", "abc"]
 */

import java.util.ArrayList;
import java.util.Arrays;

public class SubsequenceOfAString {

    public static void main(String[] args) {
        String str = "abc";
        subsequence("", str);
        System.out.println();
        System.out.println(subsequenceList("", str, new ArrayList<String>()));
        System.out.println(subsequenceList2("", str));
    }

    static void subsequence(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + "\t");
            return;
        }

        char ch = up.charAt(0);

        subsequence(p + ch, up.substring(1));   // Add the character
        subsequence(p, up.substring(1));        // Ignore the character
    }

    static ArrayList<String> subsequenceList (String p, String up, ArrayList<String> list) {
        if (up.isEmpty()) {
            if (!p.isEmpty())
                list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        list = subsequenceList(p + ch, up.substring(1), list);   // Add the character
        list = subsequenceList(p, up.substring(1), list);        // Ignore the character
        return list;
    }

    static ArrayList<String> subsequenceList2 (String p, String up) {
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            if (!p.isEmpty())
                list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        list.addAll(subsequenceList2(p + ch, up.substring(1)));   // Add the character
        list.addAll(subsequenceList2(p, up.substring(1)));        // Ignore the character
        return list;
    }
}
