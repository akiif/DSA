package Algorithms.BinarySearch;

public class SingleElementinaSortedArray540 {

    //Binary Search Approach
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int mid = start + ( ( end - start ) / 2 );

            if ( ( (mid % 2 == 0) && (nums[mid] == nums[mid + 1]) || ((mid % 2 != 0)) && (nums[mid] == nums[mid - 1]) )) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return nums[start];
    }

    //Brute Force Approach:-
    public int singleNonDuplicate2(int[] nums) {
        int i = 0;
        for (i = 1; i < nums.length; i+=2) {
            if(nums[i - 1] != nums[i])
                return nums[i - 1];
        }
        return nums[nums.length - 1];
    }
}
