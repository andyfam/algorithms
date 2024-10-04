package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubarrayOfOnesAfterDeletingOneElementTest {
    @Test
    void longestSubarray() {
        assertEquals(3, new LongestSubarrayOfOnesAfterDeletingOneElement().longestSubarray(new int[]{1,1,0,1}));
        assertEquals(5, new LongestSubarrayOfOnesAfterDeletingOneElement().longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));
        assertEquals(2, new LongestSubarrayOfOnesAfterDeletingOneElement().longestSubarray(new int[]{1,1,1}));
    }
}
