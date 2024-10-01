package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNumberOfVowelsInASubstringOfGivenLengthTest {

    @Test
    void maxVowels() {
        assertEquals(3, new MaximumNumberOfVowelsInASubstringOfGivenLength().maxVowels("abciiidef", 3));
        assertEquals(2, new MaximumNumberOfVowelsInASubstringOfGivenLength().maxVowels("aeiou", 2));
        assertEquals(2, new MaximumNumberOfVowelsInASubstringOfGivenLength().maxVowels("leetcode", 3));
    }

    @Test
    void maxVowels2() {
        assertEquals(3, new MaximumNumberOfVowelsInASubstringOfGivenLength().maxVowels2("abciiidef", 3));
        assertEquals(2, new MaximumNumberOfVowelsInASubstringOfGivenLength().maxVowels2("aeiou", 2));
        assertEquals(2, new MaximumNumberOfVowelsInASubstringOfGivenLength().maxVowels2("leetcode", 3));
    }
}
