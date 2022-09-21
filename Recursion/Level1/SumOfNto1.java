package Recursion.Level1;

/*
 Q: Find the sum of a number to 1.
*/

public class SumOfNto1 {

    public static void main(String[] args) {
        int num = 5;
        System.out.println(sumOfNto1(num));
    }

    static int sumOfNto1 (int n) {
        // base case
            if (n <= 1) {
            return n;
        }

        return n + sumOfNto1(n - 1);
    }
}
