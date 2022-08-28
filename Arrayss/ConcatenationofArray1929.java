package Arrayss;

//https://leetcode.com/problems/concatenation-of-array/

public class ConcatenationofArray1929 {

    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int count = 0;

        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < nums.length; i++) {
                ans[count] = nums[i];
                count++;
            }
        }
        return ans;
    }
}
