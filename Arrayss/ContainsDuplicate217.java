package Arrayss;

//https://leetcode.com/problems/contains-duplicate/

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {

    //Approach 1 - HashMap
    public boolean containsDuplicate1(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i ++) {
            if (hm.containsKey(nums[i])) {
                return true;
            } else {
                hm.put (nums[i], 1);;
            }
        }
        return false;
    }

    // Approach 2: HashSet
    public boolean containsDuplicate2(int[] nums) {

        final Set<Integer> distinct = new HashSet<Integer>();

        for(int num : nums) {
            if(distinct.contains(num)) {
                return true;
            }
            distinct.add(num);
        }

        return false;
    }

    //Approach 3 - Sorting
    public boolean containsDuplicate3(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
}
