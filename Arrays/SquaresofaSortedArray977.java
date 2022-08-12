package Arrays;

public class SquaresofaSortedArray977 {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        for(int i = 0 ; i<= len-1 ; i++)
        {
            nums[i] = nums[i] * nums[i];
        }
        int low = nums[0];
        for (int i = 0; i <len -1 ; i++)
        {
            for (int  j = 0 ; j < len - i - 1; j++)
            {
                if (nums[j] > nums[j+1])
                {
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
