package Algorithms.Sorting.QuickSort;

import java.util.Arrays;

/**
 * Here we take a Pivot.
 * Pivot : Choose any element as the pivot
 *  -> After first pass all the elements < pivot will be on the LHS of p
 *  and elements that are greater than pivot will be on the RHS of pivot.
 *  <p>
 *  The pivot element will be at the correct position after every single pass.
 *  How to put pivot at correct position :-
 *      We use two pointers start and end
 *      We check whether the start and end elements satisfy the conditions,
 *      if they don't then we swap them.
 *      then we increment/decrement start and end
 *      if start is greater than end then we again partition the array and do above stuff by choosing a new pivot.
 *  Note:
 *      Start and end are only used for swapping.
 *      High and low are used to show in which part of the array you are in.
 *  How to pick pivot:
 *      1. Random elements
 *      2. Corner elements
 *      3. Middle element
 *  For middle element the recurrence relation is:
 *  |________|P|_____________|
 *      K     1   N - K - 1
 *  T(K) + T(N - K - 1) + O(N)
 *  Worst case: Picking the largest or the smallest number
 *      k = 0
 *      T(N) = T(0) + T(N - 1) + O(N) = T(N - 1) + O(N) = O(N^2)
 *  Best case: The pivot element is at the correct position
 *      k = N / 2
 *      T(N) = T(N / 2) + T(N / 2) + O(N)
 *           = 2T(N / 2) + O(N)
 *           = O(NlogN)
 */

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        // base condition
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;    // Here we are taking mid as the pivot element
        int pivot = arr[mid];

        while (start <= end) {

            // also a reason why if its already sorted it will not swap
            while (arr[start] < pivot) {
                start++;
            }

            while (arr[end] > pivot) {
                end--;
            }

            // because it might reach violation and the while condition is checked only when the block of code reaches end.
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }

        }

        // now my pivot is at correct index, so sort the two halves now
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
