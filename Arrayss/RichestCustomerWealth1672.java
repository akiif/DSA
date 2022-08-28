package Arrayss;

//https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealth1672 {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;

        for (int i = 0; i < accounts.length; i++) {
            int wealthCustomer = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealthCustomer += accounts[i][j];
            }
            if (wealthCustomer > maxWealth)
                maxWealth = wealthCustomer;
        }
        return maxWealth;
    }
}
