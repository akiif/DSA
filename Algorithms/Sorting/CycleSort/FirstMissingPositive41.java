package Algorithms.Sorting.CycleSort;

// Asked in Amazon
//https://leetcode.com/problems/first-missing-positive/

import java.util.Arrays;

public class FirstMissingPositive41 {


    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 11, 12};
        System.out.println("Given Array: \n" + Arrays.toString(arr));

        int num = firstMissingPositive(arr);

        System.out.println("The missing number is: " + num);

        System.out.println("----------------------------------------------");

        int[] arr2 = {3, 4, -1, 1};
        System.out.println("Given Array: \n" + Arrays.toString(arr2));

        int num2 = firstMissingPositive(arr2);

        System.out.println("The missing number is: " + num2);

        System.out.println("----------------------------------------------");

        int[] arr3 = {1};
        System.out.println("Given Array: \n" + Arrays.toString(arr3));

        int num3 = firstMissingPositive(arr3);

        System.out.println("The missing number is: " + num3);
    }

    public static int firstMissingPositive(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            if (nums[i] <= 0 || nums[i] >= nums.length) {    // or if (nums[i] > 0 && nums[i] <= arr.length && nums[i] != nums[correct])
                i++;                                         // no outer if loop required for the above
            } else {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }
        }

        System.out.println("The array after sorting is: " + Arrays.toString(nums));

        for (int j = 0; j < nums.length; j++) {
            if (j + 1 != nums[j]) {
                return j + 1;
            }
        }

        return nums.length + 1;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
