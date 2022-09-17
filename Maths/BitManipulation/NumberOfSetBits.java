package Maths.BitManipulation;

/*
Q: Given a number n, find the number of set bits in it.
Ans:
n = 9
n = 1001
Keep finding the right most digits
n = 1001
Subtract the number with the rightmost set bit.
*/

public class NumberOfSetBits {

    public static void main(String[] args) {
        int num = 0B1010011;
        System.out.println(numberOfSetBits(num));
    }

    static int numberOfSetBits (int n) {
        int count = 0;

        while (n > 0) {
            n = n - (n & (-n));
            count++;
        }
        return count;
    }

    static int numberOfSetBits2 (int n) {
        int count = 0;

        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    static int numberOfSetBits3 (int n) {
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
