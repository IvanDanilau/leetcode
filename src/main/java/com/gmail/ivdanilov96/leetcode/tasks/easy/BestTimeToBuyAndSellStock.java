package com.gmail.ivdanilov96.leetcode.tasks.easy;

import com.gmail.ivdanilov96.leetcode.tasks.Task;
import com.gmail.ivdanilov96.leetcode.tasks.TaskNum;

@Task(TaskNum.EASY_121)
public class BestTimeToBuyAndSellStock {

  public int maxProfit(int[] prices) {
    int[] maxPrices = new int[prices.length];
    int prevMax = 0;
    for (int i = prices.length - 1; i >= 0; i--) {
      prevMax = Math.max(prices[i], prevMax);
      maxPrices[i] = prevMax;
    }
    int maxProfit = 0;
    for (int i = 0; i < prices.length; i++) {
      maxProfit = Math.max(maxPrices[i] - prices[i], maxProfit);
    }
    return maxProfit;
  }

  public int maxProfitLeetcode(int[] prices) {
    int matProfit = 0;
    int minPrice = Integer.MAX_VALUE;

    for (int price : prices) {
      minPrice = Math.min(price, minPrice);
      matProfit = Math.max(matProfit, price - minPrice);
    }
    return matProfit;
  }
}
