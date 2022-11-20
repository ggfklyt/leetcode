package com.nonsuch1.test.bitManupilation;

import com.nonsuch1.bitManupilation.SingleNumber;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SingleNumberTest {
    SingleNumber singleNumber = new SingleNumber();


    @Test
    void singleNumber() {
        int[] numbers = {6, 3, 6, 5, 3};
        int expected = 5;

        int actual = singleNumber.singleNumber(numbers);

        Assertions.assertThat(actual).isEqualTo(expected);
    }
}