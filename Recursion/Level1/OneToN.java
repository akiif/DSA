package Recursion.Level1;

/**
 Q: Write a recursive function to print from 1 to N.

 * @see Nto1
 */

public class OneToN {

    public static void main(String[] args) {
        int num = 10;
        oneToN(num);

        System.out.println("\n****************************************");

        num = 5;
        both(num);
    }

    static void oneToN (int n) {

        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        oneToN(n - 1);

        System.out.print(n + " ");
    }

    static void both (int n) {

        System.out.print(n + " ");

        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        both(n - 1);

        System.out.print(n + " ");
    }
}
