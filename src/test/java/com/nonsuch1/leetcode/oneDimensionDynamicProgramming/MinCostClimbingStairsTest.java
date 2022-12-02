package com.nonsuch1.leetcode.oneDimensionDynamicProgramming;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {

    MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();

    @Test
    void minCostClimbingStairs() {
        int[] stairs = {0, 1, 2, 2};

        int expected = 2;
        int actual = minCostClimbingStairs.minCostClimbingStairs(stairs);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}