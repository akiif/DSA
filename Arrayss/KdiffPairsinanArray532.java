package Arrayss;

//https://leetcode.com/problems/k-diff-pairs-in-an-array/
//https://leetcode.com/problems/k-diff-pairs-in-an-array/discuss/1756967/Well-Explained-oror-Two-Easy-Solutions

import java.util.*;

public class KdiffPairsinanArray532 {

    //HashMap
    public int findPairs1(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int result = 0;
        for (int i : map.keySet())
            if (k > 0 && map.containsKey(i + k) || k == 0 && map.get(i) > 1)
                result++;
        return result;
    }


    //HashSet and Sorting and Binary Search
    public int findPairs(int[] nums, int k) {
        Set<Integer> uniquePair = new HashSet();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 1; i++)
            if (Arrays.binarySearch(nums, i + 1, n, nums[i] + k) > 0)
                uniquePair.add(nums[i]);

        return uniquePair.size();
    }

    public int findPairs2(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int  i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i!=j && ((nums[i] - nums[j]) == k)) {
                    if (!map.containsKey(nums[i])) {
                        map.put(nums[i], nums[j]);
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
