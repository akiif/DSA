package Strings;

//https://leetcode.com/problems/find-the-difference/

import java.util.Arrays;
import java.util.HashMap;

public class FindtheDifference389 {

    //ASCII value implementation
    public char findTheDifference1(String s, String t) {
        int S = 0;
        int T = 0;


        for(char ch : s.toCharArray())
            S += ch;

        for(char ch : t.toCharArray())
            T += ch;

        int c = T - S;
        char ch = (char) c;
        return ch;
    }

    //Sorting Implementation
    public char findTheDifference(String s, String t) {
        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != t1[i])
                return t1[i];
        }
        return t1[t1.length -1];
    }

    //HashMap Implementation
    public char findTheDifference2(String s, String t) {
        HashMap map = new HashMap<>();
        HashMap map2 = new HashMap<>();
        int i = s.length() - 1;
        int j = t.length() - 1;
        char ch = ' ';
        while (i >= 0 || j >= 0) {
            char c;
            if (i >= 0 ) {
                c = s.charAt(i);
                if (!map.containsKey(c)) {
                    map.put(c, 1);
                } else {
                    int value = (int) map.get(c);
                    map.put(c, value + 1);
                }
                i--;
            }
            if (j >= 0 ) {
                c = t.charAt(j);
                if (!map2.containsKey(c)) {
                    map2.put(c, 1);
                } else {
                    int value = (int) map2.get(c);
                    map2.put(c, value + 1);
                }
                j--;
            }
        }
        for (Object keey : map2.keySet()) {
            char key = (char) keey;
            int val2 = (int) map2.get(key);
            int val1 = 0;
            if (!map.containsKey(key)) {
                return key;
            } else {
                val1 = (int) map.get(key);
            }
            if (val1 != val2) {
                return key;
            }
        }
        return ch;
    }
}
