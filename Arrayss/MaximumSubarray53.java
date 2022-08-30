package Arrayss;

//https://leetcode.com/problems/maximum-subarray/

public class MaximumSubarray53 {

    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max( maxEndingHere + nums[i], nums[i] );
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }

        return maxSoFar;
    }
}
