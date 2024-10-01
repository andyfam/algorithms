package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CanPlaceFlowersTest {
    @Test
    void canPlaceFlowers() {
        assertTrue(new CanPlaceFlowers().canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        assertFalse(new CanPlaceFlowers().canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
        assertFalse(new CanPlaceFlowers().canPlaceFlowers(new int[]{1,0,0,0,0,1}, 2));
    }
}
