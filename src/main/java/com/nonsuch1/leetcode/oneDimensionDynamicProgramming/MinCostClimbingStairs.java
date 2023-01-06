package com.nonsuch1.leetcode.oneDimensionDynamicProgramming;

/**
 * 746. Min Cost Climbing Stairs
 *
 * You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
 * Once you pay the cost, you can either climb one or two steps.
 *
 * You can either start from the step with index 0, or the step with index 1.
 *
 * Return the minimum cost to reach the top of the floor.
 *
 *
 *
 * Example 1:
 *
 * Input: cost = [10,15,20]
 * Output: 15
 * Explanation: You will start at index 1.
 * - Pay 15 and climb two steps to reach the top.
 * The total cost is 15.
 * Example 2:
 *
 * Input: cost = [1,100,1,1,1,100,1,1,100,1]
 * Output: 6
 * Explanation: You will start at index 0.
 * - Pay 1 and climb two steps to reach index 2.
 * - Pay 1 and climb two steps to reach index 4.
 * - Pay 1 and climb two steps to reach index 6.
 * - Pay 1 and climb one step to reach index 7.
 * - Pay 1 and climb two steps to reach index 9.
 * - Pay 1 and climb one step to reach the top.
 * The total cost is 6.
 *
 *
 * Constraints:
 *
 * 2 <= cost.length <= 1000
 * 0 <= cost[i] <= 999
 *
 */
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
