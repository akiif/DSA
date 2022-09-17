package Maths.BitManipulation;

/*
Q: Find out whether the given number is a power of 2 or not.
1 0 0 0 0 0 0 => Yes
1 0 0 0 0 1 0 => No
Ans: Only the MSB should be 1, the rest should be 0.

1 0 0 0 0 0 0 0 = 1 1 1 1 1 1 1 + 1  (Same as 2s compliment)

    1 0 0 0 0 0 0 0
 &  0 1 1 1 1 1 1 1
 ---------------------
    0 0 0 0 0 0 0 0

0 is an exception case.
*/

public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 0B100000;
        System.out.println(num + " " + powerOfTwo(num));
        System.out.println("----------------------------");

        num = 0B100010;
        System.out.println(num + " " + powerOfTwo(num));
        System.out.println("----------------------------");

        num = 0B0;
        System.out.println(num + " " + powerOfTwo(num));
    }

    static boolean powerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }


    static boolean powerOfTwo2(int n) {
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1)
                count++;
            n = n >> 1;
        }
        return (count == 1);
    }
}
