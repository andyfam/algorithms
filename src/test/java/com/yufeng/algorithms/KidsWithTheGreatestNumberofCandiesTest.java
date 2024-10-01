package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KidsWithTheGreatestNumberofCandiesTest {
    @Test
    void kidsWithCandies() {
        assertEquals(Arrays.asList(true, true, true, false, true), new KidsWithTheGreatestNumberofCandies().kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
        assertEquals(Arrays.asList(true,false,false,false,false), new KidsWithTheGreatestNumberofCandies().kidsWithCandies(new int[]{4,2,1,1,2}, 1));
        assertEquals(Arrays.asList(true,false,true), new KidsWithTheGreatestNumberofCandies().kidsWithCandies(new int[]{12,1,12}, 10));

    }
}
