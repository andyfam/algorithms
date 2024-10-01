package com.yufeng.algorithms;

import com.yufeng.algorithms.ReverseVowelsOfAString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseVowelsOfAStringTest {
    @Test
    void reverseVowels() {
        assertEquals("AceCreIm", new ReverseVowelsOfAString().reverseVowels("IceCreAm"));
        assertEquals("leotcede", new ReverseVowelsOfAString().reverseVowels("leetcode"));
    }

    @Test
    void twoPointers() {
        assertEquals("AceCreIm", new ReverseVowelsOfAString().twoPointers("IceCreAm"));
        assertEquals("leotcede", new ReverseVowelsOfAString().twoPointers("leetcode"));
    }
}
