package Arrayss;


//https://leetcode.com/problems/find-the-duplicate-number/

public class FindtheDuplicateNumber287 {

    //Approach 1 Counting
    public int findDuplicate1(int[] nums) {
        int len = nums.length;
        int[] cnt = new int[len + 1];
        for (int i = 0; i < len; i++) {
            cnt[nums[i]]++;
            if (cnt[nums[i]] > 1) {
                return nums[i];
            }
        }
        return len;
    }

    //Approach 2 Brute Force
    public static int findDuplicate_2loops(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return len;
    }
}
