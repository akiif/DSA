package Recursion.ArraysR;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 10};
        int target = 6;
        System.out.println(linearSearch(arr, target));
        System.out.println(findIndex(arr, target, 0));
        System.out.println(findIndexLast(arr, target));
        target = 5;
        System.out.println(linearSearch(arr, target));
    }

    static boolean linearSearch(int[] arr, int target) {
        return helper(arr, target, 0);
    }

    static boolean helper(int[] arr, int target, int index) {
        // base condition
        if (index >= arr.length) {  // this works for an empty array as well
            return false;
        }

        return arr[index] == target || helper(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        // base condition
        if (index >= arr.length) {  // this works for an empty array as well
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return findIndex(arr, target, index + 1);
    }

    static int findIndexLast(int[] arr, int target) {
        return findIndexLastHelper(arr, target, arr.length - 1);
    }
    static int findIndexLastHelper(int[] arr, int target, int index) {
        // base condition
        if (index == -1) {  // this works for an empty array as well
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return findIndexLastHelper(arr, target, index - 1);
    }
}
