package Maths.BitManipulation;

//https://leetcode.com/problems/single-number-ii/

import java.util.Arrays;

public class SingleNumberII137 {
    public static void main(String[] args) {
        int[] arr= {2, 2, 3, 2};
        System.out.println(Arrays.toString(arr));
        System.out.println(singleNumber2(arr));
        System.out.println("----------------------------");

        int[] arr2= {2, 2, 3, 2, 7, 7, 8, 7, 8, 8, 3, 9, 3};
        System.out.println(Arrays.toString(arr2));
        System.out.println(singleNumber(arr2));
    }

    // Approach - 1: Bit Manipulation
    /*
    Think about the number in 32 bits and just count how many 1s are there in each bit,
    and sum %= 3 will clear it once it reaches 3. After running for all the numbers for each bit,
    if we have a 1, then that 1 belongs to the single number, we can simply move it back to its spot by doing ans |= sum << i;
     */
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i < 32; i++) {
            int sum = 0;
            for (int num : nums) {
                if (((num >> i) & 1) == 1) {
                    sum++;
                    sum %= 3;
                }
            }
            if(sum != 0) {
                ans |= sum << i;
            }
        }
        return ans;
    }

    public static int singleNumber2(int[] nums) {
        int res = 0;
        for(int i = 0; i < 32; i++){
            int sum = 0;
            for(int n: nums)
                if((n >> i & 1) == 1)
                    sum++;
            sum %= 3;  // Will be either 0 or 1
            res |= sum<<i;
        }
        return res;
    }

    // Approach - 2 Brute Force with Sorting
    public static int singleNumber3(int[] nums) {
        int n = nums.length;
        if (nums.length - 1 == 0) return nums[0];

        Arrays.sort(nums);
        for (int i = 2; i < n; i+=3) {
            if((nums[i] == nums[i - 1]) && (nums[i] != nums[i - 2])) {
                return nums[i - 2];
            }
        }
        return nums[n - 1];
    }
}
