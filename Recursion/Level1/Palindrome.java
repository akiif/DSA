package Recursion.Level1;

public class Palindrome {
    public static void main(String[] args) {
        int num = 1221;
        System.out.println(palindrome(num));
    }

    static boolean palindrome (int n) {
        return n == (reverse(n));
    }
    static int reverse (int n) {
        int digits = (int) Math.log10(n) + 1;

        return revHelper (n, digits);
    }

    static int revHelper (int n, int digits) {
        if (n % 10 == n) {
            return n;
        }

        return (n % 10) * (int) (Math.pow(10, digits - 1)) + revHelper(n / 10, digits - 1 );
    }

    // Iterative Approach
    static boolean palindrome2 (int n) {
        int x = n;
        int rev = 0;

        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        return rev == n;
    }
}
