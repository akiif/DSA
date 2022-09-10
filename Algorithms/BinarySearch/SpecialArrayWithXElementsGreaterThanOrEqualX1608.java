package Algorithms.BinarySearch;

//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/

import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanOrEqualX1608 {

    public static void main(String[] args) {
        // Test Cases:

        int[] arr = {3, 5};
        System.out.println(Arrays.toString(arr));
        System.out.println(specialArray2(arr));
        System.out.println("------------------------------");

        int[] arr1 = {0, 0};
        System.out.println(Arrays.toString(arr1));
        System.out.println(specialArray2(arr1));
        System.out.println("------------------------------");

        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.toString(arr2));
        System.out.println(specialArray2(arr2));
        System.out.println("------------------------------");
    }

    // Approach - 1 : Binary Search
    public static int specialArray2(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        // enumerate all possible number i
        for (int x = 0; x <= nums[len - 1]; x++) {
            // find the first index that nums[idx] >= i
            int idx = findFirstGreaterOrEqual(x, nums);
            if (len - idx == x) {
                return x;
            }
        }
        return -1;
    }

    public static int findFirstGreaterOrEqual(int target, int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid;
            }
        }

        if (nums[left] >= target) {
            return left;
        }
        return right; // whether right >= target or right > target
    }

    public static int specialArray3(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length; i++){
            int l = 0, r = nums.length;
            while(l < r){
                int m = l + (r - l) / 2;
                if(nums[m] >= i) r = m;
                else l = m + 1;
            }
            if((nums.length - l) == i) return i;
        }
        return -1;
    }

    // Approach - 2
    public static int specialArray4(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        for (int x = 1; x <= nums.length; x++) {
            int candidate = nums.length - x;

            if (nums[candidate] >= x && (candidate == 0 || nums[candidate - 1] < x)) {
                return x;
            }
        }

        return -1;
    }
}
