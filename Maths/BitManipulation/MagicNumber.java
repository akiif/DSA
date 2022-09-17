package Maths.BitManipulation;

//Asked in Amazon
/*
Q. Find the nth magic number.
Ans: While converting from binary to decimal, instead of 2power use 5power

n & 1 will give the binary number.
Example:
n = 6 => 110

0 * 5pow1 + 1 * 5pow2 + 1 * 5pow3

*/

public class MagicNumber {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("The " + num + "th magic number is: " + magicNumber(num));

    }

    static int magicNumber(int n) {
        int ans = 0;

        int count = 1;
        int base = 5;
        while (n > 0) {
            int last = n & 1;
            ans += last * Math.pow(base, count);
            n = n >> 1;
            count++;
        }
        return ans;
    }
}
