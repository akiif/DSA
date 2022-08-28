package Arrayss;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies1431 {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int max = Integer.MIN_VALUE;

            for (int num: candies) {
                if (num > max) max = num;
            }
            List<Boolean> ans = new ArrayList<>();
            for (int i = 0; i < candies.length; i++) {
                if ((candies[i] + extraCandies) >= max) {
                    ans.add(true);
                } else {
                    ans.add(false);
                }
            }
            return ans;
        }
    }
}
