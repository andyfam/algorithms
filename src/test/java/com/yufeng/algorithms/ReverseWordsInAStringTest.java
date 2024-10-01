package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsInAStringTest {
    @Test
    void reverseWords() {
        assertEquals("blue is sky the", new ReverseWordsInAString().reverseWords("the sky is blue"));
        assertEquals("world hello", new ReverseWordsInAString().reverseWords("  hello world  "));
        assertEquals("example good a", new ReverseWordsInAString().reverseWords("a good   example"));
    }
}
