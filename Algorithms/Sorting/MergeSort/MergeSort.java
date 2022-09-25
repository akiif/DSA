package Algorithms.Sorting.MergeSort;

import java.util.Arrays;

/**
 *  It uses the divide and conquer approach.
 *  First divide the array and sort the array pieces, then merge those pieces and again sort them.
 *  Steps:
 *  1.  Divide the array into 2 parts.
 *  2.  Get both parts sorted via recursion.
 *  3.  Merge the sorted parts.
 * <p>
 *  At every level, N elements are getting merged.
 *  Time Complexity: O(N * logN)
 *  Space Complexity: Auxiliary: O(N)
 *  Merge Sort is better when used with linked list.
 * @see MergeSortInPlace
 */

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 12, 5, 6, 1, 2};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergeSort(int[] arr) {
        // base condition
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));    // Here it is exclusive. i.e. It does not include the last element
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;  // index for the first arr
        int j = 0;  // index for the second arr
        int k = 0;  // index for the mix arr

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k++] = first[i];
                i++;
            } else {
                mix[k++] = second[j];
                j++;
            }
        }

        // it may be possible that one of the arrays has not been completely added
        while (i < first.length) {
            mix[k++] = first[i++];
        }

        while (j < second.length) {
            mix[k++] = second[j++];
        }

        return mix;
    }
}
