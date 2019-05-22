package com.interview.prepare.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BuySellStocks {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int gain = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                max = min;
            } else if (prices[i] > max) {
                max = prices[i];
            }
            if (max - min > gain) {
                gain = max - min;
            }
        }
        return gain;
    }

    public int maxProfit2(int[] prices) {
        int gain = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                gain = gain + prices[i + 1] - prices[i];
            }
        }
        return gain;
    }

    // TODO https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
    public int maxProfit3(int[] prices) {
        int gain = 0;
        List<Integer> gains = new ArrayList<Integer>();
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                gains.add(prices[i + 1] - prices[i]);
            }
        }
        gains.sort(Comparator.reverseOrder());
        return gains.get(0) + gains.get(1);
    }
}
