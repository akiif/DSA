package Algorithms.BinarySearch;

//https://leetcode.com/problems/keep-multiplying-found-values-by-two/

import java.util.Arrays;

public class KeepMultiplyingFoundValuesbyTwo2154 {

    //Hashing the Given Array
    public int findFinalValue(int[] nums, int original) {

        int[] arr = new int[1001];

        for (int x : nums)
            arr[x]++;

        while ( ( original <= 1000 ) && ( arr[original] != 0 ) ) {
            original *= 2;
        }
        return original;
    }

    //Binary Search Approach
    public int findFinalValue2(int[] nums, int original) {

        Arrays.sort(nums);

        if (binarySearch(nums, original, 0, nums.length - 1)) {

            while (true) {
                original *= 2;
                if (binarySearch(nums, original, 0, nums.length - 1)) {
                    ;
                } else {
                    return original;
                }
            }

        } else {
            return original;
        }

    }

    public static boolean binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + ( ( end - start ) / 2 );

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
