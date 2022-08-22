package Arrayss;

//https://leetcode.com/problems/missing-number/

public class MissingNumber268 {

    //Approach 1 Math
    public int missingNumber1(int[] nums) {
        int sum = nums.length;
        for (int i = 0; i < nums.length; i++)
            sum += i - nums[i];
        return sum;
    }
    //Approach 2 First find fibonacci of length and then add the contents of array and subtract it with the fibonacci
    public int missingNumber2(int[] nums) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 1; i <= nums.length; i++)
            sum += i;
        for (int i = 0; i < nums.length; i++)
            sum1 += nums[i];
        return sum - sum1;
    }
    //Approach 3 Sorting and Linear search
    public int missingNumber3(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i + 1) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                return i + 1;
        }
        return 0;
    }
}
