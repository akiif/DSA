package Recursion.PatternsR;

import java.util.Arrays;

/**
 * @see Algorithms.Sorting.SelectionSort.SelectionSort
 * @see Triangle#print1(int)
 */

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 8, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {4, 3, 2, 8, 1};
        selectionSort2(arr2, arr2.length, 0, 0);
        System.out.println(Arrays.toString(arr2));
    }

    static void selectionSort2(int[] arr, int row, int col, int max) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            if (arr[col] > arr[max]) {
                selectionSort2(arr, row, col + 1, col);
            } else {
                selectionSort2(arr, row, col + 1, max);
            }
        } else {
            swap(arr, max, row - 1);
            selectionSort2(arr, row - 1, 0, 0);
        }
    }

    static void selectionSort(int[] arr) {
        sort(arr, arr.length - 1);
    }

    private static void sort (int[] arr, int end) {
        if (end == 0) {
            return;
        }

        if (end > 0) {
            int max = max(arr, 0, end, 0, 0);
            swap(arr, max, end);
            sort(arr, end - 1);
        }
    }

    private static int max(int[] arr, int start, int end, int max,int maxIndex) {
        if (start > end) {
            return maxIndex;
        }
        if (arr[start] > max) {
            max = arr[start];
            maxIndex = start;
        }
        return max(arr, start + 1, end, max, maxIndex);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
