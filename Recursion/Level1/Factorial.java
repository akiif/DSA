package Recursion.Level1;

/*
Find the factorial of a number using recursion.
5! = 5 * 4 * 3 * 2 * 1
fact(n) = n * fact(n - 1)
Aka Product from N  to 1.
fact(0) = 1
*/
public class Factorial {

    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
    }

    static int factorial(int n) {
        // base case
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
