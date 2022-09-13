package Recursion;

/*
0th     1st     2nd     3rd     4th     5th     6th     7th     8th
0        1       1       2       3      5        8       13      21

Fib (N) = Fib(N - 1) + Fib(N - 2)

 */

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("The " + n + "th fibonacci number is: " + fibonacci(n));
    }

    static int fibonacci(int n) {

        // base condition
        if (n < 2)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Fibonacci using iteration
    public int fib(int n) {

        if (n < 2) {
            return n;
        }

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}
