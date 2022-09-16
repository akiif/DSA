package Maths.BitManipulation;

/*
Q: Given a number n find if it is odd or even.
Ans: Check if the last bit (LSB) is 1 or 0.
If it is 1 then its odd, else even
LSB: Least Significant Bit.
 */

public class EvenOrOddUsingAndOperator {

    public static void main(String[] args) {
        int num = 67;
        System.out.println(isOdd(num));
        evenOrOdd(num);
    }

    static boolean isOdd(int num) {
        return (num & 1) == 1;
    }
    static void evenOrOdd(int num) {
        if ((num & 1) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
