package Algorithms.BinarySearch;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 * @see Algorithms.BinarySearch.SearchinRotatedSortedArrayPivotWithoutDupliate33
 */

import java.util.Arrays;

public class SearchinRotatedSortedArrayPivotWithDupliateValues {

    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 1, 2, 3, 4};
        int target = 3;
        System.out.println(Arrays.toString(arr) + "  " +target);
        int index = search(arr, target);
        System.out.println("The resulting search index is: " + index);
        System.out.println();
        int[] num = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 1;
        System.out.println(Arrays.toString(num) + "  " +target1);
        int index1 = search(num, target1);
        System.out.println("The resulting search index is: " + index1);
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicate(nums);
        System.out.println("Pivot: " + pivot);

        //If you did not find a pivot it means the array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If pivot is found, then you have found 2 asc sorted array
        if (nums[pivot] == target)
            return pivot;

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // Case 3 - target < nums[0]
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    //Approach - 1 Find the pivot in the array
    // [3, 4, 5, 6,  7,    0, 1, 2]
    //  [asc,      pivot,   asc]

    public static int findPivotWithDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + ( ( end - start ) / 2 );

            // 4 cases
            // Case 1
            if ( (mid < end) && ( arr[mid] > arr[mid + 1] ) ) {
                return mid;
            }
            // Case 2
            if ( (mid > start)  &&  arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // Case 3 :-
            // If element at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start]  && arr[mid] == arr[end]) {
                //skip the duplicates

                // NOTE: what is these elements at start and end where the pivots
                // check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                // Check if end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if ( ( arr[start] < arr[mid] ) || ( (arr[start] == arr[mid]) && arr[mid] > arr[end] ) ) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + ( ( end - start ) / 2 );

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
