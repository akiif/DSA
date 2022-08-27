package Arrayss;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class FindNumberswithEvenNumberofDigits1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int digitCount = 0;
            int val = nums[i];
            while (val != 0) {
                val = val / 10;
                digitCount++;
            }
            if (digitCount % 2 == 0)
                count++;
        }
        return count;
    }
}
