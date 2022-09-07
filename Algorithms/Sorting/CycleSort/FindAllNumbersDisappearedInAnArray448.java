package Algorithms.Sorting.CycleSort;

// Asked in Google and Microsoft
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray448 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Given Array: \n" + Arrays.toString(arr));

        List<Integer> num = findDisappearedNumbers(arr);

        System.out.println("The missing number range is: " + num);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int i = 0;

        // It also works for duplicates in the if section
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        System.out.println("After sorting: " + Arrays.toString(nums));

        for (int index = 0; index < nums.length; index++) {
            if (index + 1 !=  nums[index] ) {
                result.add(index + 1);
            }
        }

        return result;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
