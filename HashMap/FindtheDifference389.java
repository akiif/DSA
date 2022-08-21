package HashMap;

//https://leetcode.com/problems/find-the-difference/

import java.util.HashMap;

public class FindtheDifference389 {
    public char findTheDifference(String s, String t) {
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