package com.nonsuch1.leetcode.oneDimensionDynamicProgramming;

public class MinCostClimbingStairs {
    int[] minCost;

    public int minCostClimbingStairs(int[] cost) {
        int index = cost.length;
        minCost = new int[cost.length];
        return Math.min(minCost(cost, index - 1), minCost(cost, index - 2));
    }

    public int minCost(int[] cost, int index) {
        if (minCost[index] != 0)
            return minCost[index];
        if (index < 0)
            return 0;
        if (index == 0 || index == 1)
            return minCost[index] = cost[index];
        return minCost[index] =
                Math.min(cost[index] + minCost(cost, index - 1),
                        cost[index] + minCost(cost, index - 2));
    }
}
