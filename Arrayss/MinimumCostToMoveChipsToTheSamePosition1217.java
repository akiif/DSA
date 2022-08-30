package Arrayss;

//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/

public class MinimumCostToMoveChipsToTheSamePosition1217 {

    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;

        for (int chips : position) {
            if (chips % 2 == 0)
                even++;
            else
                odd++;
        }
        return Math.min(even, odd);
    }
}
