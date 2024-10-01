package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseBitsTest {
    @Test
    void stack() {
//        String str = "00000010100101000001111010011100";
//        int input = Integer.parseUnsignedInt(str, 2);
//
//        int result = new ReverseBits().reverseBits(input);
//        String bits = Integer.toBinaryString(result);
//        bits = String.format("%32s", bits).replace(" ", "0");
//        assertEquals("00111001011110000010100101000000", bits);

        String str = "11111111111111111111111111111101";
        int input = Integer.parseUnsignedInt(str, 2);

        int result = new ReverseBits().stack(input);
        String bits = Integer.toBinaryString(result);
        bits = String.format("%32s", bits).replace(" ", "0");
        assertEquals("10111111111111111111111111111111", bits);
    }

    @Test
    void MastAndShift() {
        String str = "11111111111111111111111111111101";
        int input = Integer.parseUnsignedInt(str, 2);

        int result = new ReverseBits().MastAndShift(input);
        String bits = Integer.toBinaryString(result);
        bits = String.format("%32s", bits).replace(" ", "0");
        assertEquals("10111111111111111111111111111111", bits);
    }
}
