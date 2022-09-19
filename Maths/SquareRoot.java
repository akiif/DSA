package Maths;

/**
 * https://leetcode.com/problems/sqrtx/
 * @see NewtonRaphsonMethod
 */


public class SquareRoot {

    public static void main(String[] args) {
        int n = 36;
        System.out.println(binarySearchSqrt(n));
        n = 40;
        System.out.println(mySqrt(n));

        System.out.println("------------------------------");

        int num = 50000, precision = 3;
        System.out.println("n: " +num + ", p: " +  precision + " = " + sqrt(num, precision));
        System.out.println(Math.sqrt(num));
    }


    // Find the square root of a number with two decimal points.
    // Time Complexity:- O(log(n))
    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;

        double root = 0.0;

        while (s <= e) {

            int mid  = s + (e - s) /2;

            if (mid * mid == n) {
                return mid;
            }

            if (mid * mid > n) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        //root = e; // We will get the precise answer if we remove this, but it will be very slow.
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }

        return root;
    }


    //Q: Find the square root of a number (the decimal points are to be truncated).
    static int mySqrt(int n) {
        if (n == 0)
            return 0;

        int start = 1;  // Always start from 1 else you will get division by zero error
        int end = n;

        while (true) {

            int mid = start + (end - start) / 2;

            if (mid > n / mid) {     // same as mid * mid > n
               end = mid - 1;
            } else {

                if (mid + 1 > (n / (mid + 1))) {
                    return mid;
                }
                start = mid + 1;
            }
        }
    }



    //Q: Find the perfect square root of a number.
    // Binary Search Approach
    static int binarySearchSqrt(int n) {
        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == n) {
                return mid;
            }

            if (mid * mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }


    // Brute Force Approach
    static int sqrt2(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (i * i == n) {
                return i;
            }
        }
        return -1;
    }
}
