package com.nonsuch1.leetcode.bitManupilation;


import com.nonsuch1.leetcode.bitManupilation.NumberOfOneBits;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberOfOneBitsTest {
    NumberOfOneBits numberOfOneBits = new NumberOfOneBits();

    @Test
    void hammingWeight() {
        int expected = 2;
        int actual = numberOfOneBits.hammingWeight(6);

        Assertions.assertThat(actual).isEqualTo(expected);

    }
}