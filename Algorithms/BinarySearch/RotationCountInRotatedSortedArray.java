package Algorithms.BinarySearch;

//

import java.util.Arrays;

public class RotationCountInRotatedSortedArray {

    public static void main(String[] args) {
        int arr[] = {4, 4, 4, 1, 2, 3, 4};
        countRotations(arr);

        int[] arr1 = {15, 18, 2, 3, 6, 12};
        countRotations(arr1);

        int[] arr2 = {1, 2, 3, 4, 5, 6};
        countRotations(arr2);
    }

    public static void countRotations(int[] arr) {
        System.out.println(Arrays.toString(arr));

        int pivot = findPivotWithDuplicate(arr);
        System.out.println("The array has been rotated " + (pivot + 1) + " times.");
        System.out.println("---------------------------------------------------");
    }

    public static int findPivotWithDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + ((end - start) / 2);

            if ( (mid < end) && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if ( (mid > start) && arr[mid] < arr[mid - 1] ) {
                return mid - 1;
            }

            if ( (arr[mid] == arr[start]) && (arr[mid] == arr[end])) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            else if ( (arr[start] < arr[mid]) && ( (arr[start] == arr[mid]) && (arr[end] < arr[mid])) ) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }
}
