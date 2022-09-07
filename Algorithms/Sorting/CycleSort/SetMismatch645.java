package Algorithms.Sorting.CycleSort;

//https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;
import java.util.List;

public class SetMismatch645 {

    public static void main(String[] args) {
        int[] arr = {8, 7, 3, 5, 3, 6, 1, 4};
        System.out.println("Given Array: \n" + Arrays.toString(arr));

        int[] num = findErrorNums(arr);

        System.out.println("The missing number is: " + Arrays.toString(num));
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        int[] res = {-1, -1};
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (j+1 != nums[j]) {
                return new int[]{nums[j], j+1};
            }
        }
        return res;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
