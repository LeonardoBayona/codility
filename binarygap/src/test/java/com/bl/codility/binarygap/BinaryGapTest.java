package com.bl.codility.binarygap;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryGapTest {

    @Test
    public void test1() {
        testBinaryGap(0b1001, 2);
        testBinaryGap(0b1000010001, 4);
        testBinaryGap(0b10100, 1);
        testBinaryGap(0b1111, 0);

        testBinaryGap(0b0, 0);

        testBinaryGap(0b10, 0);
        testBinaryGap(0b1000, 0);
        testBinaryGap(0b1, 0);

        testBinaryGap(0b11, 0);
        testBinaryGap(0b101, 1);
        testBinaryGap(0b1000001, 5);

        testBinaryGap(0b101000, 1);
        testBinaryGap(0b1000001000, 5);

        testBinaryGap(0b10100000001, 7);
        testBinaryGap(0b100000100000001, 7);

        testBinaryGap(0b100000000010100000001, 9);
        testBinaryGap(0b1000000000100000100000001, 9);

        testBinaryGap(0b1000100000000010100000001, 9);
        testBinaryGap(0b10001000000000100000100000001, 9);
    }

    private void testBinaryGap(int number, int expected) {
        // given
        BinaryGap binaryGap = new BinaryGap();

        // when
        int response1 = binaryGap.calculateBinaryGap(number);
        int response2 = binaryGap.calculateBinaryGap2(number);

        // then
        assertThat(response1).isEqualTo(expected);
        assertThat(response2).isEqualTo(expected);
    }

}