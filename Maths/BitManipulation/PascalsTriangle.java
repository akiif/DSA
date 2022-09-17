package Maths.BitManipulation;

/*
Pascals Triangle:-
1
1   1
1   2   1
1   3   3   1
1   4   6   4   1
1   5   10  10  5   1

Sum of each row =
nC0 + nC1 + nC2 + ... + nCn = 2powN


Q: Find the sum of nth row
Ans:

1 << (n - 1)  => 1 * 2powN-1
We are doing -1 because we are starting from 0
*/

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 3;
        int ans = 1 << (n - 1); // For finding square of a number do 1 left-shift that number
        System.out.println(ans);
    }
}
