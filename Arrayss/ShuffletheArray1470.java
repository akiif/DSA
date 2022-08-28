package Arrayss;

//https://leetcode.com/problems/shuffle-the-array/

public class ShuffletheArray1470 {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] ans = new int[len];
        int index = 0;

        for (int i = 0; i < n; i++) {
            ans[index] = nums[i];
            index += 2;
        }
        index = 1;
        for (int i = n; i < len; i++){
            ans[index] = nums[i];
            index += 2;
        }
        return ans;
    }
}
