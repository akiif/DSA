package Algorithms.BinarySearch;

//https://leetcode.com/problems/find-in-mountain-array/

public class FindinMountainArray1095 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 5, 3, 1};
        int target = 3;
        System.out.println("The minimum index where the target is found is: " + findInMountainArray(arr, target));
    }

    public static int findInMountainArray(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int lhsIndex =  orderAgnosticBS(arr, target, 0, peak);
        if (lhsIndex != -1) {
            return lhsIndex;
        }
        int rhsIndex = orderAgnosticBS(arr, target, peak, arr.length - 1);
        return rhsIndex;
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + ( ( end - start ) / 2 );

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
        }
        return start;
    }

    public static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + ( ( end - start ) / 2 );   //same as start + end / 2 but here int overflow might happen so this formula is used.

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}


/*
For LeetCode Submission:-
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int lhsIndex =  orderAgnosticBS(mountainArr, target, 0, peak, true);
        if (lhsIndex != -1) {
            return lhsIndex;
        }
        int rhsIndex = orderAgnosticBS(mountainArr, target, peak, mountainArr.length() - 1, false);
        return rhsIndex;
    }

    public static int peakIndexInMountainArray(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {

            int mid = start + ( ( end - start ) / 2 );

            int value = mountainArr.get(mid);
            int valuePlusOne = mountainArr.get(mid + 1);

            if (value < valuePlusOne) {
                start = mid + 1;
            } else if (value > valuePlusOne) {
                end = mid;
            }
        }
        return start;
    }

    public static int orderAgnosticBS(MountainArray mountainArr, int target, int start, int end,boolean isAsc) {

        while (start <= end) {

            int mid = start + ( ( end - start ) / 2 );
            int value = mountainArr.get(mid);

            if (value == target) {
                return mid;
            }

            if (isAsc) {
                if (target < value) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > value) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
 */