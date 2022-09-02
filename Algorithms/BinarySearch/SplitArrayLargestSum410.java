package Algorithms.BinarySearch;

// Asked in Google
//https://leetcode.com/problems/split-array-largest-sum/

public class SplitArrayLargestSum410 {

    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;
        int sum = splitArray(nums, m);
        System.out.println(sum);
    }

    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        while (start < end) {

            //try for middle as potential answer
            int mid = start + ( ( end - start ) / 2);

            //Calculate how many pieces we can divide this into with this mid (Which is the max sum allowed)
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    // you cannot add in this in sub-array, make a new one
                    // say you add this num in sub-array, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end; // Here we can return either start or end since at the end start == end
    }

}
