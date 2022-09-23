package Algorithms.Sorting.SelectionSort;

/**
It performs well on small lists
It is an unstable algorithm.
Space Complexity :- O(1)
Time Complexity :-
    Best Case O(N^2)
    Worst Case O(N^2)

 @see Recursion.PatternsR.SelectionSort
*/

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {10, 3, 3, -30, 5, 2, 1, 4};
        System.out.println("Array before sorting: \n" + Arrays.toString(arr));
        System.out.println("-----------------------------------------------------");
        selectionSort(arr);

        System.out.println("Array after sorting: \n" + Arrays.toString(arr));
        System.out.println("-----------------------------------------------------");

        Arrays.sort(arr);
        System.out.println("Array after sorting with Arrays.sort(): \n" + Arrays.toString(arr));
        System.out.println("-----------------------------------------------------");
    }

    // In selection sort we first find the max/min element and then put it in the appropriate position
    public static void selectionSort(int[] arr) {
        int index = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr, last);
            swap(arr, maxIndex, last);
        }
    }

    public static int getMaxIndex(int[] arr, int end) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
