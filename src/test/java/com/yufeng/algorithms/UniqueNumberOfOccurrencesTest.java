package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UniqueNumberOfOccurrencesTest {

    @Test
    void uniqueOccurrences() {
        assertTrue(new UniqueNumberOfOccurrences().uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        assertFalse(new UniqueNumberOfOccurrences().uniqueOccurrences(new int[]{1, 2}));
        assertTrue(new UniqueNumberOfOccurrences().uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
    }
}
