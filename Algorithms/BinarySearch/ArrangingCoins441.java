package Algorithms.BinarySearch;

//https://leetcode.com/problems/arranging-coins/

public class ArrangingCoins441 {

    public int arrangeCoins(int n) {
        long left = 0;
        long right = n;
        long k, curr;
        while (left <= right) {

            k = left + (right - left) / 2;
            curr = k * (k + 1) / 2;

            if (curr == n ) {
                return (int) k;
            }

            if (n < curr) {
                right = k - 1;
            } else {
                left = k + 1;
            }
        }
        return (int) right;
    }
}
