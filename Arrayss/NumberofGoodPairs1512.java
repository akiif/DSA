package Arrayss;

//https://leetcode.com/problems/number-of-good-pairs/

public class NumberofGoodPairs1512 {

    public int numIdenticalPairs1(int[] nums) {
        int[] arr = new int[101];
        for(int i = 0;i<nums.length;i++){
            arr[nums[i]] ++;
        }
        int ans = 0;
        for(int i = 0;i<arr.length;i++){
            int count = arr[i];
            ans += count*(count - 1)/2;
        }
        return ans;
    }

    public int numIdenticalPairs2(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++)
                if (nums[i] == nums[j] && i < j)
                    count++;
        }
        return count;
    }
}
