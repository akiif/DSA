package Arrayss;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class TwoSumIIInputArrayIsSorted167 {

    //2 pointer approach
    public int[] twoSum(int[] numbers, int target) {
        int j = numbers.length - 1;
        int i = 0;

        while (i <= j) {

            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                int res[] = {i + 1, j + 1};
                return res;
            }

            if (sum > target) {
                j--;    //last element has to be removed to reduce the value of sum so do j--
            } else {
                i++;   //we have to add little to increase the sum
            }
        }
        return null;
    }
}
