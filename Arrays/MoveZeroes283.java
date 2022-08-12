package Arrays;

//https://leetcode.com/problems/move-zeroes/

public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        int ballSize = 0;
        int length = nums.length;
        for (int i = 0; i < length ; i++) {
            if(nums[i] == 0) {
                ballSize++;
            }
            else {
                int temp = nums[i];
                nums[i] = 0;
                nums[i-ballSize] = temp;
            }
        }
    }
}
