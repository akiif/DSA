package Recursion.Level1;

/**
 Q: Find the sum of the digits of a number.

 * @see SumOfDigits
 */

public class ProductOfDigits {

    public static void main(String[] args) {
        int num = 1234;
        System.out.println(productOfDigits(num));
    }

    static int productOfDigits (int n) {

        if (n == 0) {       // OR -> if (n % 10 == n) return n;
            return 1;
        }

        return productOfDigits(n / 10) * (n % 10);
    }
}
