package com.nonsuch1.leetcode.bitManupilation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseBitsTest {

    ReverseBits reverseBits = new ReverseBits();

    @Test
    void reverseBits() {
        int expected = 2147483647;

        int actual = reverseBits.reverseBits(Integer.MAX_VALUE);

        Assertions.assertThat(actual).isEqualTo(expected);
    }
}