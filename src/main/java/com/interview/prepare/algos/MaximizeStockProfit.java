package com.interview.prepare.algos;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/#/description
 * Created by bojan on 4/7/17.
 */
public class MaximizeStockProfit {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int min = prices[0];
        int max = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];
            if (price < min) {
                min = price;
                max = price;
            } else if (price > max) {
                max = price;
            }
            if (max - min > profit) {
                profit = max - min;
            }
        }
        return profit;
    }
}
