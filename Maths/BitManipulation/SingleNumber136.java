package Maths.BitManipulation;

//https://leetcode.com/problems/single-number/

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
*/

import java.util.Arrays;

public class SingleNumber136 {

    public static void main(String[] args) {
        int[] arr ={2, 2, 1};
        System.out.println(Arrays.toString(arr));
        System.out.println(singleNumber(arr));
        System.out.println("------------------------------------");

        int[] arr2 ={2, 3, 4, 1, 2, 1, 3, 6, 4};
        System.out.println(Arrays.toString(arr2));
        System.out.println(singleNumber(arr2));
        System.out.println("------------------------------------");
    }

    /* Approach 1: Using the XOR Operator.
        Time Complexity = O(n)
        Space Complexity = 0(1)
     */
    /*
    We know that any number xor with itself we get zero.
    And we also know that any number xor with 0 will be the number itself.
    So here we will xor the entire array and the resultant will be the single element.
     */
    public static int singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }

    // Approach 2 - Brute Force Approach
    public static int singleNumber2(int[] nums) {
        int n = nums.length;
        if (nums.length == 0) return -1;
        if (nums.length - 1 == 0) return nums[0];

        Arrays.sort(nums);
        for (int i = 1; i < n; i+=2) {
            if(nums[i] != nums[i - 1]) {
                return nums[i - 1];
            }
        }
        return nums[n - 1];
    }
}
