package Arrayss;

//https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition35 {

    //Binary Search Approach
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = 0;
        if (target > nums[right]) return right + 1;

        while (left < right) {
            int mid = ( left + right ) / 2;

            if (target == nums[mid])
                return mid;

            if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
