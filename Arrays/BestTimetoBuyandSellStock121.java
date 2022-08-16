package Arrays;

public class BestTimetoBuyandSellStock121 {
    public int maxProfit(int[] prices) {
        int maxiProfit = 0;
        int n = prices.length;
        int min = prices[0];

        for (int i = 0; i < n; i++) {
            if (prices[i] < min ) {
                min = prices[i];
            } else {
                maxiProfit = Math.max(maxiProfit, prices[i] - min);
            }
        }
        return maxiProfit;
    }
}
