package Recursion.ArraysR;

// Q. Find if the array is sorted or not.

public class SortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6, 8, 10};
        System.out.println(sortedArray2(arr1));
        System.out.println(sortedArray(arr1, 0));

        System.out.println("--------------------------------------");
        int[] arr2 = {1, 2, 4, 9, 8, 10};
        System.out.println(sortedArray(arr2, 0));
    }


    static boolean sortedArray (int[] arr, int index) {
        // base condition
        if (index == arr.length - 1) {
            return true;
        }

        /* Check if the current index element is smaller than the next index element and whether the rest of the array is sorted.
        Example : arr = [1, 2, 4, 6, 8] index= 0
        Check whether arr[0] < arr[1] and whether the array [2, 4, 6, 8] is sorted.
        */
        // recursive call
        return arr[index] < arr[index + 1] && sortedArray(arr, index + 1);
    }


    // Linear Search Approach
    static boolean sortedArray2 (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
