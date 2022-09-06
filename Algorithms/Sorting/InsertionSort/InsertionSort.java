package Algorithms.Sorting.InsertionSort;

/*
We are partially sorting the array.

For every index:
    Put that index element at the correct index of LHS

It is adaptive: steps get reduced if array is sorted
* No. of swaps are reduced as compared to bubble sort.
* Used for smaller values of n
* Works good when array is partially sorted i.e. parts of array are sorted.
* It takes part in hybrid sorting categories (like merge or quick)
It is a Stable algorithm.
Space Complexity :- O(1)
Time Complexity :-
    Best Case O(N)
    Worst Case O(N^2)
*/

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {10, 3, 3, -30, 5, 2, -20, 1, 4};
        System.out.println("Array before sorting: \n" + Arrays.toString(arr));
        System.out.println("-----------------------------------------------------");

        insertionSort(arr);

        System.out.println("Array after sorting: \n" + Arrays.toString(arr));
        System.out.println("-----------------------------------------------------");

        Arrays.sort(arr);
        System.out.println("Array after sorting with Arrays.sort(): \n" + Arrays.toString(arr));
        System.out.println("-----------------------------------------------------");
    }

    public static void insertionSort(int[] arr) {
        // run the loop still N - 2, or it is till 2nd last element
        for (int i = 0; i < arr.length - 1; i++) {  // or i <= N - 2
            // j is always i + 1
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                     swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
