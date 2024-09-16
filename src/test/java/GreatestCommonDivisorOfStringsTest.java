import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreatestCommonDivisorOfStringsTest {
    @Test
    void gcdOfStrings() {
        assertEquals("ABC", new GreatestCommonDivisorOfStrings().gcdOfStrings("ABCABC", "ABC"));
        assertEquals("AB", new GreatestCommonDivisorOfStrings().gcdOfStrings("ABABAB", "ABAB"));
        assertEquals("", new GreatestCommonDivisorOfStrings().gcdOfStrings("LEET", "CODE"));
    }

    @Test
    void gcdOfStrings2() {
        assertEquals("ABC", new GreatestCommonDivisorOfStrings().gcdOfStrings2("ABCABC", "ABC"));
        assertEquals("AB", new GreatestCommonDivisorOfStrings().gcdOfStrings2("ABABAB", "ABAB"));
        assertEquals("", new GreatestCommonDivisorOfStrings().gcdOfStrings2("LEET", "CODE"));
    }
}
