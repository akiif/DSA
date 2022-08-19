package Arrayss;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicatesfromSortedArray26 {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int ballsize = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[ballsize] != nums[i]) {
                nums[k] = nums[i];
                k++;
                ballsize++;
            } else {
                ballsize++;
            }
        }
        return k;
    }
}
