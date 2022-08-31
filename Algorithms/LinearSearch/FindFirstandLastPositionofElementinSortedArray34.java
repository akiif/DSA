package Algorithms.LinearSearch;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray34 {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(nums));
        System.out.println(target);

        int[] ans = searchRange3(nums, target);
        System.out.println("The first and last index are: " + Arrays.toString(ans));
    }

    //Brute Force Approach - Start from first and last
    public static int[] searchRange3(int[] nums, int target) {
        int[] ans = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans[0] = i;
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                ans[1] = i;
                break;
            }
        }

        return ans;
    }

}
