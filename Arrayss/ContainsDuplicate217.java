package Arrayss;

//https://leetcode.com/problems/contains-duplicate/

import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate217 {

    //Approach 1 - HashMap
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < nums.length; i ++) {
                if (! hm.containsKey(nums[i])) {
                    hm.put (nums[i], 1);
                } else {
                    return true;
                }
            }
            return false;
        }
    }

    //Approach 2 - Sorting
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
}
