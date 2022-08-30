package Arrayss;

//https://leetcode.com/problems/maximum-subarray/

import java.util.Arrays;

public class MaximumSubarray53 {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Arrays.toString(arr));
        int res = maxSubArray(arr);
        System.out.println(res);
    }

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max( maxEndingHere + nums[i], nums[i] );
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }

        return maxSoFar;
    }
}
