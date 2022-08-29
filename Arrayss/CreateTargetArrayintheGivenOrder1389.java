package Arrayss;

//https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.ArrayList;

public class CreateTargetArrayintheGivenOrder1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        ArrayList<Integer> read = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            read.add(index[i], nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            target[i] = read.get(i);
        }
        return target;
    }
}
