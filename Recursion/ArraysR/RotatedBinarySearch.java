package Recursion.ArraysR;

/**
 * Asked in Google and Amazon
 * @see Algorithms.BinarySearch.SearchinRotatedSortedArrayPivotWithoutDupliate33
 */

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        int target = 9;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(rotatedBinarySearch(arr, target, start, end));
        target = 5;
        System.out.println(rotatedBinarySearch(arr, target, start, end));
        target = 2;
        System.out.println(rotatedBinarySearch(arr, target, start, end));
        target = 4;
        System.out.println(rotatedBinarySearch(arr, target, start, end));
    }

    static int rotatedBinarySearch (int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // Case 1: If mid is in the LHS
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {   // if the target exists in the LHS
                return rotatedBinarySearch(arr, target, start, mid - 1);
            } else {    // If the target is greater than the mid or if the target is in the RHS.
                // start = mid + 1
                return rotatedBinarySearch(arr, target, mid + 1, end);
            }
        }
        /*
        s     m        e
        5, 6, 1, 2, 3, 4        target = 2
         */
        if (target >= arr[mid] && target <= arr[end]) {
            // start = mid + 1;
            return rotatedBinarySearch(arr, target, mid + 1, end);
        } else {
            /*
            s     m        e
            5, 6, 1, 2, 3, 4        target = 6
            */
            // end = mid - 1;
            return rotatedBinarySearch(arr, target, start, mid - 1);
        }
    }
}
