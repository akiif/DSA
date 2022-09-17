package Maths.BitManipulation;

/*
Q: Find XOR of numbers from 0 to a
Ans:
a   XOR from 0 to a
0   0
1   1
2   3
3   0
4   4
5   1
6   7
7   0
8   8
9   1
*/

public class XorTillA {
    public static void main(String[] args) {
        int a = 7;
        System.out.println(xorTillA(a));
    }

    static int xorTillA(int a) {
        if (a % 4 == 0) {
            return a;
        } else if (a % 4 == 1) {
            return 1;
        } else if (a % 4 == 2) {
            return a + 1;
        } else {  // if (a % 4 == 3) {
            return 0;
        }
    }
}
