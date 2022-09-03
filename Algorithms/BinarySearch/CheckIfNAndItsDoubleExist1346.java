package Algorithms.BinarySearch;

//https://leetcode.com/problems/check-if-n-and-its-double-exist/

import java.util.Arrays;
import java.util.HashSet;

public class CheckIfNAndItsDoubleExist1346 {

    //Binary Search Approach
    public boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if ( (arr[i] % 2 == 0) && (arr[i] < 0)) {
                if (binarySearch(arr, arr[i] / 2, i + 1, arr.length - 1)) {
                    return true;
                }

            }
            else {
                if (binarySearch(arr, arr[i] * 2, i + 1, arr.length - 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + ( ( end - start ) / 2 );   //same as start + end / 2 but here int overflow might happen so this formula is used.

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

    //HashSet Approach
    public boolean checkIfExist2(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if ( ( set.contains(num * 2) ) ||
                    //Since here we are searching for num/2 then num should always be even since 2 * any no. is even
                    ( ( num % 2 == 0 ) && ( set.contains(num / 2) ) ) )
                return true;
            set.add(num);
        }
        return false;
    }

    //Brute Force Approach
    public boolean checkIfExist3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ( (arr[i]*2 == arr[j] ) && (i != j) )
                    return true;
            }
        }
        return false;
    }
}
