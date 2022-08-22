package Arrayss;

//https://leetcode.com/problems/single-number-ii/

import java.util.Arrays;

public class SingleNumberII137 {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        if (nums.length - 1 == 0) return nums[0];

        Arrays.sort(nums);
        for (int i = 2; i < n; i+=3) {
            if((nums[i] == nums[i - 1]) && (nums[i] != nums[i - 2])) {
                return nums[i - 2];
            }
        }
        return nums[n - 1];
    }
}
