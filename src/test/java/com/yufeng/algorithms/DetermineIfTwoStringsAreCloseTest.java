package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DetermineIfTwoStringsAreCloseTest {

    @Test
    void closeStrings() {
        assertTrue(new DetermineIfTwoStringsAreClose().closeStrings("abc", "bca"));
        assertFalse(new DetermineIfTwoStringsAreClose().closeStrings("a", "aa"));
        assertTrue(new DetermineIfTwoStringsAreClose().closeStrings("cabbba", "abbccc"));
        assertFalse(new DetermineIfTwoStringsAreClose().closeStrings("aaabbbbccddeeeeefffff", "aaaaabbcccdddeeeeffff"));
    }

    @Test
    void closeStrings2() {
        assertTrue(new DetermineIfTwoStringsAreClose().closeStrings2("abc", "bca"));
        assertFalse(new DetermineIfTwoStringsAreClose().closeStrings2("a", "aa"));
        assertTrue(new DetermineIfTwoStringsAreClose().closeStrings2("cabbba", "abbccc"));
        assertFalse(new DetermineIfTwoStringsAreClose().closeStrings2("aaabbbbccddeeeeefffff", "aaaaabbcccdddeeeeffff"));
    }
}
