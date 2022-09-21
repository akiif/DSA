package Recursion.Level1;

/**
Q: Find the sum of the digits of a number.

 * @see ProductOfDigits
 */

public class SumOfDigits {

    public static void main(String[] args) {
        int num = 1342;
        System.out.println(sumOfDigits(num));
    }

    static int sumOfDigits (int n) {

        if (n == 0) {
            return 0;
        }

        int digit = n % 10;

        return digit + sumOfDigits(n / 10);
    }
}
