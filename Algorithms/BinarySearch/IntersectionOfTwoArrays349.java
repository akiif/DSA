package Algorithms.BinarySearch;

//https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays349 {

    public static void main(String[] args) {
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8, 4};

        int[] res = intersection(arr1, arr2);

        System.out.println(Arrays.toString(res));
    }

    // Binary Search Approach
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i < nums1.length; i++) {
            if (binarySearch(nums2, nums1[i])) {
                if (!hs.contains(nums1[i])) {
                    hs.add(nums1[i]);
                }
            }
        }

        int[] arr = new int[hs.size()];
        int i = 0;
        for (int num : hs) {
            arr[i] = num;
            i++;
        }
        return arr;
    }
    public static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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


    //Sets Approach
    public static int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int j : nums1) {
            set.add(j);
        }
        for (int j : nums2) {
            if (set.contains(j)) {
                intersect.add(j);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }
}
