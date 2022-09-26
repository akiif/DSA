package Recursion.Subset;

import java.util.ArrayList;
import java.util.List;

/**
 * Asked in Google
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * @see Recursion.BackTracking.LetterCombinationsOfAPhoneNumber17
 * 2 -> abc,    3 -> def,     4 -> ghi,     5 -> jkl...
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * Take it as:
 *  1    2   3      4      5          6   7   8    9
 * abc  def ghi  j  k l   m  n  o   pqr  stu vwx  yz
 * 012  345 678  9 10 11  12 13 14
 * digit range => multiple of digit - 1
 * digit range => [(digit - 1) * 3, digit * 3)
 * For example 2 => 3 to 5
 * If we are starting from 0 then skip index 26
 */

public class LetterCombinationsOfAPhoneNumber17 {
    public static void main(String[] args) {
        String digits = "89";
        numPad("", digits);
        System.out.println(numPadList("", digits));
        System.out.println("The number of combination possible: " + numPadCount("", digits));
        System.out.println(letterCombinations(digits));
    }


    // Here it is assuming that the character mapping is starting from 1
    static void numPad (String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; // this will convert '2' to 2.

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            if (i == 26) break; // In case of 9 do until 25
            char ch = (char) ('a' + i);
            numPad(p + ch, up.substring(1));
        }
    }

    // Here it is assuming that the character mapping is starting from 1
    static List<String> numPadList (String p, String up) {
        List<String> list = new ArrayList<>();

        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0'; // this will convert '2' to 2.

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            if (i == 26) break;     // In case of 9
            char ch = (char) ('a' + i);
            list.addAll(numPadList(p + ch, up.substring(1)));
        }
        return list;
    }

    static int numPadCount (String p, String up) {
        int count = 0;

        if (up.isEmpty()) {
            return ++count;
        }

        int digit = up.charAt(0) - '0'; // this will convert '2' to 2.

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            if (i == 26) break;     // In case of 9
            char ch = (char) ('a' + i);
            count += numPadCount(p + ch, up.substring(1));
        }

        return count;
    }

    // https://leetcode.com/problems/letter-combinations-of-a-phone-number/
    // LeetCode answer
    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();
        return combinations("", digits);
    }

    static List<String> combinations(String p, String up) {
        List<String> list = new ArrayList<>();

        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '1'; // this will convert '2' to 2.

        if (digit == 6) {       // For the digit 7 => pqrs
            for (int i = (digit - 1) * 3; i <= digit * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(combinations(p + ch, up.substring(1)));
            }
        } else if (digit == 7) {    // For digit 8 => tuv
            for (int i = (digit - 1) * 3 + 1; i <= digit * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(combinations(p + ch, up.substring(1)));
            }
        } else if (digit == 8) {    // For digit 9 => wxyz
            for (int i = (digit - 1) * 3 + 1; i <= digit * 3 + 1; i++) {
                char ch = (char) ('a' + i);
                list.addAll(combinations(p + ch, up.substring(1)));
            }
        } else {    // For rest of the digits
            for (int i = (digit - 1) * 3 ; i < digit * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(combinations(p + ch, up.substring(1)));
            }
        }

        return list;
    }

}
