package Algorithms.BinarySearch;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//Asked in Facebook

import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray34 {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(nums));
        System.out.println(target);

        int[] ans = searchRange3(nums, target);
        System.out.println("The first and last index with Brute Force Approach " +
                "are: " + Arrays.toString(ans) + "\n");

        int[] ans1 = searchRange(nums, target);
        System.out.println("The first and last index with Binary Search Approach " +
                "are: " + Arrays.toString(ans1));
    }

    //Binary Search Approach
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = binarySearch(nums, target, true);
        if (ans[0] != -1)
            ans[1] = binarySearch(nums, target, false);

        return ans;
    }

    // this function just returns the index value of target
    public static int binarySearch(int[] nums, int target, boolean findStartIndex) {

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + ( ( end - start ) / 2 );   //same as start + end / 2 but here int overflow might happen so this formula is used.

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]){
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {   // If finding the start index then check in the lhs
                    end = mid - 1;
                }  else {
                    start = mid + 1;  // If finding the end index then check in the rhs
                }
            }
        }
        return ans;
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
