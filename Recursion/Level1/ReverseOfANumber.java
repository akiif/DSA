package Recursion.Level1;

/*
Q: Find the reverse of a Number.

F(N) = F(N / 10)

*/
public class ReverseOfANumber {

    static int reverse = 0;

    public static void main(String[] args) {
        int num = 1824;
        reverseOfANumber(num);
        System.out.println(reverse);

        System.out.println("--------------------------------");

        System.out.println(reverseOfANumber2(num));
    }



    // Approach - 1
    static void reverseOfANumber (int n) {

        if (n == 0) {
            return;
        }

        reverse = reverse * 10 + n % 10;

        reverseOfANumber (n / 10);
    }


    // Approach - 2
    static int reverseOfANumber2 (int n) {
        // sometimes you might need some additional variables in the argument.
        // in that case, make another function

        int digits = (int) (Math.log10(n)) + 1;

        return helper(n, digits);
    }

    private static int helper (int n, int digits) {
        if (n % 10 == n) {
            return n;
        }

        int rem = n % 10;

        return rem * (int) Math.pow(10, digits - 1) + helper(n /10, digits - 1);
    }



    // Iterative Approach
    public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }

        return (int) rev;
    }
}
