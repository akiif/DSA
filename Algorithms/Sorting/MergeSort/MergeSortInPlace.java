package Algorithms.Sorting.MergeSort;

import java.util.Arrays;

/**
 * @see MergeSort
 */

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 12, 5, 6, 1, 2};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {

        if (end - start == 1) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace (int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        while (i < mid) {
            mix[k++] = arr[i++];
        }

        while (j < end) {
            mix[k++] = arr[j++];
        }

        // Copy the mix into the original array
        System.arraycopy(mix, 0, arr, start, mix.length);
        /*  same as:-
        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
        */
    }
}
