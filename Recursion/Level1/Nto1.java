package Recursion.Level1;

/**
 Q: Write a recursive function that prints from N to 1.

 * @see OneToN
 */

public class Nto1 {
    public static void main(String[] args) {
        int num = 10;
        nTo1(num);
    }

    static void nTo1 (int n) {
        System.out.print(n + " ");

        // base condition
        if (n == 1) {
            System.out.println();
            return;
        }

        // recursive call
        nTo1(--n);
    }
}
