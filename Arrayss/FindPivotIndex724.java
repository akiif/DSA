package Arrayss;

//https://leetcode.com/problems/find-pivot-index/

public class FindPivotIndex724 {
    public int pivotIndex(int[] nums) {
        int pivot = -1;
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++){
                leftSum += nums[j];
            }
            for (int k = nums.length - 1 ; k > i; k--) {
                rightSum += nums[k];
            }
            if (leftSum == rightSum) {
                pivot = i;
                return pivot;
            }
        }
        return pivot;
    }
    //Approach 2 PrefixSum by LeetCode
    public int pivotIndex2(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x : nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }
}
