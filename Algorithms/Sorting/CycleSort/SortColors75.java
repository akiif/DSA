package Algorithms.Sorting.CycleSort;

//https://leetcode.com/problems/sort-colors/

import java.util.Arrays;

public class SortColors75 {

    public static void main(String[] args) {
        int[] arr = {1,2,0};
        System.out.println("Given Array: \n" + Arrays.toString(arr));

        sortColors(arr);

        System.out.println("The sorted array is: " + Arrays.toString(arr));
    }

    // Approach 1 : Sorting 0s to the left and 2s to the right
    public static void sortColors(int[] nums) {
        int j = 0;
        int k = nums.length - 1;

        for (int i = 0; i <= k; i++) {
            if (nums[i] == 0) {
                swap(nums, i--, j++);
            } else if (nums[i] == 2) {
                swap(nums, i--, k--);  // We are doing i-- since we want to check the ith index again
                // as it get's incremented in the for loop.
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Approach 2: Counting the number of 0s, 1s and 2s and then replacing them
    public void sortColors2(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int index = 0;

        for (int num : nums) {
            if (num == 0) count0++;
            if (num == 1) count1++;
            if (num == 2) count2++;
        }

        for (; count0 >= 1; count0--) {
            nums[index++] = 0;
        }
        for (; count1 >= 1; count1--) {
            nums[index++] = 1;
        }
        for (; count2 >= 1; count2--) {
            nums[index++] = 2;
        }

    }
}
