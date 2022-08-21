package Arrayss;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

public class BestTimetoBuyandSellStockII122 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int flag = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
