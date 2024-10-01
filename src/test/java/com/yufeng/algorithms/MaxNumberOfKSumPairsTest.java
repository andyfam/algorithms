package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxNumberOfKSumPairsTest {
    @Test
    void map1() {
        assertEquals(2, new MaxNumberOfKSumPairs().map1(new int[]{1, 2, 3, 4}, 5));
        assertEquals(1, new MaxNumberOfKSumPairs().map1(new int[]{3, 1, 3, 4, 3}, 6));
    }

    @Test
    void map2() {
        assertEquals(2, new MaxNumberOfKSumPairs().map2(new int[]{1, 2, 3, 4}, 5));
        assertEquals(1, new MaxNumberOfKSumPairs().map2(new int[]{3, 1, 3, 4, 3}, 6));
    }

    @Test
    void maxOperations() {
        assertEquals(2, new MaxNumberOfKSumPairs().maxOperations(new int[]{1, 2, 3, 4}, 5));
        assertEquals(1, new MaxNumberOfKSumPairs().maxOperations(new int[]{3, 1, 3, 4, 3}, 6));
        assertEquals(2, new MaxNumberOfKSumPairs().maxOperations(new int[]{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4}, 2));
    }
}
