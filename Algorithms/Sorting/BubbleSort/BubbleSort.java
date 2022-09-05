package Algorithms.Sorting.BubbleSort;

/*
Also known as Sinking Sort and Exchange Sort
It is an in-place sorting array.
It is a stable algorithm.
Space Complexity :- O(1)
Time Complexity :-
    Best Case O(N)  -> Array is sorted
    Worst Case O(N^2) -> Array is sorted in opposite

 */

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {10, 3, 3, -30, 5, 2, 1, 4};
        System.out.println("Array before sorting: \n" + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Array after sorting: \n" + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Array after sorting with Arrays.sort(): \n" + Arrays.toString(arr));
        System.out.println("-----------------------------------------------------");
    }

    public static void bubbleSort(int[] arr) {

        //run the steps n - 1 times
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {  // <=  arr.length - 1 - i
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    swapped = true;
                }
            }
            // If there is no swap occurring in Ith iteration that means that the array is already sorted, so exit the loop.
            if (!swapped)
                return;
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
