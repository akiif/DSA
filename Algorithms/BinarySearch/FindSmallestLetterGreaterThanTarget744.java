package Algorithms.BinarySearch;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class FindSmallestLetterGreaterThanTarget744 {

    public char nextGreatestLetter(char[] letters, char target) {
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

        if (start > letters.length - 1)
            return letters[0];

        return letters[start];
    }
}
