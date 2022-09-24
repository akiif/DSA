package Recursion;

/**
 * https://leetcode.com/problems/power-of-four/
 * @see PowerOfTwo231
 * @see PowerOfThree326
 */

public class PowerOfFour342 {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPowerOfFour(num));

        num = 6;
        System.out.println(isPowerOfFour(6));
    }

    public static boolean isPowerOfFour(int n) {
        if (n == 1) {
            return true;
        }

        if (n == 0) {
            return false;
        }

        if (n % 4 != 0) {
            return false;
        }

        return isPowerOfFour(n / 4);
    }
}
