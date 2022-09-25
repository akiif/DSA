package Recursion;

/**
 * https://leetcode.com/problems/powx-n/
 * @see Maths.BitManipulation.APowerB
 */


public class PowOfXRaisedToN {

    public static void main(String[] args) {
        double x = 2.000;
        int n = -2147483648;
        System.out.println(myPow(x, n));

        n = 10;
        System.out.println(myPow(x, n));

        n = -2;
        System.out.println(myPow(x, n));
    }

    // Recursive
    public static double myPow(double x, int n) {
        if(n == 0)
            return 1;

        if(n < 0){
            return 1 / x * myPow(1 / x, -(n + 1));
        }

        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }

    // nest myPow
    double myPow1(double x, int n) {
        if(n<0) return 1/x * myPow(1/x, -(n+1));
        if(n==0) return 1;
        if(n==2) return x*x;
        if(n%2==0) return myPow( myPow(x, n/2), 2);
        else return x*myPow( myPow(x, n/2), 2);
    }

    // Iterative
    static double myPow2(double x, int n) {
        if(n==0) return 1;
        if(n<0) {
            n = -n;
            x = 1/x;
        }
        double ans = 1;
        while(n>0){
            if((n&1) == 1)
                ans *= x;
            x *= x;
            n >>= 1;
        }
        return ans;
    }
}
