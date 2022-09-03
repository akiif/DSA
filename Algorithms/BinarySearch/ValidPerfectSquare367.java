package Algorithms.BinarySearch;

//https://leetcode.com/problems/valid-perfect-square/

public class ValidPerfectSquare367 {

    public static void main(String[] args) {
        int num = 808201;
        System.out.println(isPerfectSquare(num));
    }
    // Don't use int because it will cause integer overflow in mid * mid
    public static boolean isPerfectSquare(int num) {
        long end = num;
        long start = 1;

        while (start <= end) {

            long mid = start + (end - start) / 2;

            long pow2 = mid * mid;
            /*
            Instead of checking for pow2 we can also use:
                int res = num / mid, remain = num % mid;
                if (res == num && remain == 0) return true;
                if (res > num) return start = mid + 1
                This is used to avoid using long
             */

            if (pow2 == num) {
                return true;
            }

            if (pow2 < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
