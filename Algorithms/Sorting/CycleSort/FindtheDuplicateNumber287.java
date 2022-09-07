package Algorithms.Sorting.CycleSort;

// Asked in Amazon
//https://leetcode.com/problems/find-the-duplicate-number/

import java.util.Arrays;

public class FindtheDuplicateNumber287 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println("Given Array: \n" + Arrays.toString(arr));

        int num = findDuplicate(arr);

        System.out.println("The missing number is: " + num);
    }


    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {

            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }

        }
        return -1;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
