package com.nonsuch1.slidingWindow;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing
 * a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int profit = solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(profit);
    }

    static class Solution {
        public int maxProfit(int[] prices) {
            int maxProfit = 0;
            for (int i = 0; i < prices.length; i++) {
                int buyPrice = prices[i];
                int sellPrice = buyPrice;
                for (int j = i + 1; j < prices.length; j++) {
                    if (prices[j] > sellPrice) {
                        sellPrice = prices[j];
                    }
                }
                if (sellPrice - buyPrice > maxProfit) {
                    maxProfit = sellPrice - buyPrice;
                }
            }
            return maxProfit;
        }
    }

}
