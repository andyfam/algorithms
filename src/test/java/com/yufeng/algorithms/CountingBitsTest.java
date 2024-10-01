package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CountingBitsTest {
    @Test
    void countBits() {
        assertArrayEquals(new int[]{0, 1, 1}, new CountingBits().countBits(2));
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, new CountingBits().countBits(5));
    }

    @Test
    void iterate() {
        assertArrayEquals(new int[]{0, 1, 1}, new CountingBits().iterate(2));
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, new CountingBits().iterate(5));
    }
}
