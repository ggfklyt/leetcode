package com.nonsuch1.test.bitManupilation;

import com.nonsuch1.bitManupilation.SomeBitPractice;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SomeBitPracticeTest {
    private SomeBitPractice someBitPractice = new SomeBitPractice();

    @Test
    void setBit() {
        int num = 8;
        int position = 1;

        String binaryNum = Integer.toBinaryString(num);
        StringBuilder stringBuilder = new StringBuilder(binaryNum);
        stringBuilder.setCharAt(stringBuilder.length() - 1 - position, '1');
        String expected = stringBuilder.toString();

        String actual = Integer.toBinaryString(someBitPractice.setBit(num, position));

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void clearBit() {
        int num = 10;
        int position = 1;

        String binaryNum = Integer.toBinaryString(num);
        StringBuilder stringBuilder = new StringBuilder(binaryNum);
        stringBuilder.setCharAt(stringBuilder.length() - 1 - position, '0');
        String expected = stringBuilder.toString();

        String actual = Integer.toBinaryString(someBitPractice.clearBit(num, position));

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void flipBit() {
        int num = 10;
        int position = 1;

        String binaryNum = Integer.toBinaryString(num);
        StringBuilder stringBuilder = new StringBuilder(binaryNum);
        stringBuilder.setCharAt(stringBuilder.length() - 1 - position, '0');
        String expected = stringBuilder.toString();

        String actual = Integer.toBinaryString(someBitPractice.flipBit(num, position));

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void isBitSet() {
        int num = 10;
        int position = 1;

        boolean actual = someBitPractice.isBitSet(num, position);

        assertThat(actual).isTrue();
    }


}