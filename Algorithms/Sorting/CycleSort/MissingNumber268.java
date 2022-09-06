package Algorithms.Sorting.CycleSort;

// Asked in Amazon
//https://leetcode.com/problems/missing-number/

import java.util.Arrays;

public class MissingNumber268 {

    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println("Given Array: \n" + Arrays.toString(arr));

        int num = missingNumber(arr);

        System.out.println("The missing number is: " + num);
    }

    //After sorting, element == index
    public static int missingNumber(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i];
            if ( (nums[i] < nums.length ) && ( nums[i] != nums[correct] ) ) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        System.out.println("Sorted Array is: " + Arrays.toString(nums));

        //Case 1: The missing number is present in the array
        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j]) {
                return j;
            }
        }
        //Case 2: When N is not there in the array
        return nums.length;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
