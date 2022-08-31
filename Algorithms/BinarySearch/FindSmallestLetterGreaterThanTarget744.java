package Algorithms.BinarySearch;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

import java.util.Arrays;

public class FindSmallestLetterGreaterThanTarget744 {

    public static void main(String[] args) {
        char[] letters = {'a', 'b'};
        char target = 'z';
        System.out.println(Arrays.toString(letters));
        System.out.println("Target: " + target);
        System.out.println("Answer: " + nextGreatestLetter(letters, target));
        System.out.println("-------------------------------------------------------");
        char[] letters1 = {'c', 'f', 'j'};
        char target1 = 'd';
        System.out.println(Arrays.toString(letters1));
        System.out.println("Target: " + target1);
        System.out.println("Answer: " + nextGreatestLetter(letters1, target1));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {

            int mid = start + ( ( end - start) / 2 );

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
//        if (start > letters.length - 1)   // You can also do 'return letters[start % letters.length];' Instead of the if statement
//            return letters[0];
//
//        return letters[start];
    }
}
