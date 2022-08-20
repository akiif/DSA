package Maths;

//https://leetcode.com/problems/n-th-tribonacci-number/

public class Tribonacci1137 {
    public int tribonacci(int n) {
        if ( n < 2 ) return n;
        int a = 0, b = 1, c = 1,d;

        while (n > 2) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
            n--;
        }
        return c;
    }
}
