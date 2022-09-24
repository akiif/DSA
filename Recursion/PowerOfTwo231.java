package Recursion;

/**
 * https://leetcode.com/problems/power-of-two/
 * @see Maths.BitManipulation.PowerOfTwo
 * @see PowerOfFour342
 * @see PowerOfThree326
 */

public class PowerOfTwo231 {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPowerOfTwo(num));

        num = 10;
        System.out.println(isPowerOfTwo(num));
    }
    public static boolean isPowerOfTwo(int n) {

        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if ((n & 1) == 1) {
            return false;
        }

        return isPowerOfTwo(n / 2);
    }

    static boolean powerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }
}
