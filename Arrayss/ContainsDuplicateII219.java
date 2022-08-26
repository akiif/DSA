package Arrayss;

//https://leetcode.com/problems/contains-duplicate-ii/

import java.util.HashMap;

public class ContainsDuplicateII219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean flag = false;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i ++) {
            if (! hm.containsKey(nums[i])) {
                hm.put (nums[i], i);
            } else {
                int j = hm.get(nums[i]);
                if (Math.abs(i - j) <= k)
                    return true;
                else {
                    hm.put(nums[i], i);
                }
            }
        }
        return flag;
    }
}
