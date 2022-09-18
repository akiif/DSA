package Maths.BitManipulation;

/*
Q. Find all the numbers between a & b
Example:
a = 3, b = 9
Ans: 3 ^ 4 ^ 5 ^ 6 ^ 7 ^ 8 ^ 9

0 ^ 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 7 ^ 8 ^ 9
|_________|
     |
    These are extra's, so we can remove them.
=> ( 0 - (a - 1) ) ^ (0 - b)
 */


public class RangeXOR {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        System.out.println(rangeXOR(a, b));
        rangeXOR2(a, b);
    }

    static int rangeXOR(int a, int b) {
        // range xor for a, b = xor(b) ^ xor(a - 1)
        return xor(b) ^ xor(a - 1);
    }

    // Will give time limit exceed for large numbers.
    static void rangeXOR2 (int a, int b) {
        int ans = 0;
        for (int i = a; i <= b; i++)
            ans ^= i;
        System.out.println(ans);
    }
    // This gives xor from 0 to a
    static int xor (int a) {
        if (a % 4 == 0) {
            return a;
        } else if (a % 4 == 1) {
            return 1;
        } else if (a % 4 == 2) {
            return a + 1;
        } else { // if (a % 4 == 3) {
            return 0;
        }
    }
}
