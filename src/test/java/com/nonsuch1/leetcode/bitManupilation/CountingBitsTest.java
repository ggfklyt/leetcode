package com.nonsuch1.leetcode.bitManupilation;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CountingBitsTest {
    CountingBits countingBits = new CountingBits();

    @Test
    void countBits() {
        int[] expected = new int[]{0, 1, 1, 2, 1, 2};

        int[] actual = countingBits.countBits(15);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}