package com.nonsuch1.leetcode.arraysAndHashing.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class TopKFrequentElementsTest {
    TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

    @Test
    void test() {
        int[] nums = new int[]{1, 2, 2, 3, 3, 3, 4, 4};
        int k = 2;

        int[] expected = new int[]{3, 2};
        int[] actual = topKFrequentElements.topKFrequent(nums, k);

        assertThat(actual).isEqualTo(expected);
    }


}