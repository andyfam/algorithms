package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ContainsDuplicateTest {

    @Test
    void containsDuplicate() {
        assertTrue(new ContainsDuplicate().containsDuplicate(new int[]{1,2,3,1}));
        assertFalse(new ContainsDuplicate().containsDuplicate(new int[]{1,2,3,4}));
        assertTrue(new ContainsDuplicate().containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    @Test
    void sort() {
        assertTrue(new ContainsDuplicate().sort(new int[]{1,2,3,1}));
        assertFalse(new ContainsDuplicate().sort(new int[]{1,2,3,4}));
        assertTrue(new ContainsDuplicate().sort(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}
