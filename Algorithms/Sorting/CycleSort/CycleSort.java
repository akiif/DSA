package Algorithms.Sorting.CycleSort;

/*

* When given numbers from range 1, N -> Use Cycle sort

It is a Stable algorithm.
Space Complexity :- O(1)
Time Complexity :-
    Best Case O(N)
    Worst Case O(N^2)
*/

import java.util.Arrays;

public class CycleSort {

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        System.out.println("Array before sorting: \n" + Arrays.toString(arr));
        System.out.println("-----------------------------------------------------");

        cycleSort(arr);

        System.out.println("Array after sorting: \n" + Arrays.toString(arr));
        System.out.println("-----------------------------------------------------");

        Arrays.sort(arr);
        System.out.println("Array after sorting with Arrays.sort(): \n" + Arrays.toString(arr));
        System.out.println("-----------------------------------------------------");
    }

    public static void cycleSort(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if ( arr[i] != arr[correct] ) {
                swap(arr, i, correct );
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
