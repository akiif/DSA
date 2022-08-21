package Arrayss;

//https://leetcode.com/problems/single-number/

import java.util.Arrays;

public class SingleNumber136 {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        if (nums.length - 1 == 0) return nums[0];

        Arrays.sort(nums);
        for (int i = 1; i < n; i+=2) {
            if(nums[i] != nums[i - 1]) {
                return nums[i - 1];
            }
        }
        return nums[n - 1];
    }
}
