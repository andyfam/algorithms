package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOf1BitsTest {
    @Test
    void hammingWeight() {
        assertEquals(3, new NumberOf1Bits().binaryString(11));
        assertEquals(1, new NumberOf1Bits().binaryString(128));
        assertEquals(30, new NumberOf1Bits().binaryString(2147483645));
    }

    @Test
    void bitWiseAnd() {
        assertEquals(3, new NumberOf1Bits().bitWiseAnd(11));
        assertEquals(1, new NumberOf1Bits().bitWiseAnd(128));
        assertEquals(30, new NumberOf1Bits().bitWiseAnd(2147483645));
    }

    @Test
    void unsignedRightShift() {
        assertEquals(3, new NumberOf1Bits().unsignedRightShift(11));
        assertEquals(1, new NumberOf1Bits().unsignedRightShift(128));
        assertEquals(30, new NumberOf1Bits().unsignedRightShift(2147483645));
    }
}
