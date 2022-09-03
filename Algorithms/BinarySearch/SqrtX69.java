package Algorithms.BinarySearch;

//https://leetcode.com/problems/sqrtx/

public class SqrtX69 {

    public static void main(String[] args) {
        int num = 8;
        System.out.println(mySqrt(num));
    }

    //Binary Search Approach
    public static int mySqrt(int x) {
        if (x == 0)
            return 0;

        int left = 1, right = x;

        while (true) {

            int mid = left + (right - left)/2;

            if (mid > x/mid) {
                right = mid - 1;
            }

            else {

                if (mid + 1 > x/(mid + 1))
                    return mid;

                left = mid + 1;
            }
        }
    }

    //Brute Force Approach using Maths
    public int mySqrt2(int x) {
        int count = 0;
        int num = x;
        int i = 1;

        while (num > 0) {
            num -= i;
            i += 2;
            count++;
        }
        if (num == 0) return count;
        else return --count;
    }
}
