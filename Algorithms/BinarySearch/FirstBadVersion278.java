package Algorithms.BinarySearch;

//https://leetcode.com/problems/first-bad-version/

public class FirstBadVersion278 {

    public static boolean[] arr = {false, false, true, true, true, true};

    public static int firstBadVersion(int n) {
        int ans = -1;
        int start = 1;
        int end = n;

        while (start <= end) {

            int mid = start + ( ( end - start ) / 2 );

            if ( isBadVersion(mid) ) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println(firstBadVersion(num));
    }
    public static boolean isBadVersion(int num) {
        if (arr[num - 1])
            return true;

        return false;
    }
}

