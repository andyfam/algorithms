package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPivotIndexTest {

    @Test
    void mergeAlternately() {
        assertEquals(3, new FindPivotIndex().pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        assertEquals(-1, new FindPivotIndex().pivotIndex(new int[]{1, 2, 3}));
        assertEquals(0, new FindPivotIndex().pivotIndex(new int[]{2, 1, -1}));
        assertEquals(2, new FindPivotIndex().pivotIndex(new int[]{-1,-1,0,0,-1,-1}));
    }
}
