import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ValidAnagramTest {

    @Test
    void isAnagram() {
        assertTrue(new ValidAnagram().isAnagram("anagram", "nagaram"));
        assertFalse(new ValidAnagram().isAnagram("rat", "car"));
    }

    @Test
    void sort() {
        assertTrue(new ValidAnagram().sort("anagram", "nagaram"));
        assertFalse(new ValidAnagram().sort("rat", "car"));
    }

    @Test
    void hashmap() {
        assertTrue(new ValidAnagram().hashmap("anagram", "nagaram"));
        assertFalse(new ValidAnagram().hashmap("rat", "car"));
    }

    @Test
    void intArray() {
        assertTrue(new ValidAnagram().intArray("anagram", "nagaram"));
        assertFalse(new ValidAnagram().intArray("rat", "car"));
    }
}
