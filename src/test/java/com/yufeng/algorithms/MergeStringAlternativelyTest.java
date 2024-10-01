package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeStringAlternativelyTest {
    @Test
    void mergeAlternately() {
        assertEquals("apbqcr", new MergeStringAlternatively().mergeAlternately("abc", "pqr"));
        assertEquals("apbqrs", new MergeStringAlternatively().mergeAlternately("ab", "pqrs"));
        assertEquals("apbqcd", new MergeStringAlternatively().mergeAlternately("abcd", "pq"));
    }
}
