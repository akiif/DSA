package Arrayss;

//https://leetcode.com/problems/two-sum/

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int res[] = {i, j};
                    return res;
                }
            }
        }
        return null;
    }
}
