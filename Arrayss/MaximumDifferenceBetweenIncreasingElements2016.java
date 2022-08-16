package Arrayss;

//https://leetcode.com/problems/maximum-difference-between-increasing-elements/

public class MaximumDifferenceBetweenIncreasingElements2016 {
    public int maximumDifference(int[] nums) {
        int maxDiff = -1;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] < nums[j] && i < j)
                    maxDiff = Math.max(maxDiff, Math.abs(nums[i] - nums[j]));
            }
        }
        return maxDiff;
    }
}
