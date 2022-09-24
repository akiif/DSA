package Recursion;

/**
 * https://leetcode.com/problems/power-of-three/
 * @see PowerOfTwo231
 * @see PowerOfFour342
 */

public class PowerOfThree326 {
    public static void main(String[] args) {
        int num = 27;
        System.out.println(isPowerOfThree(num));

        num = 6;
        System.out.println(isPowerOfThree(num));
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }

        if (n == 0) {
            return false;
        }

        if (n % 3 != 0) {
            return false;
        }

        return isPowerOfThree(n / 3);
    }
}
