import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCompressionTest {
    @Test
    void compress() {
        char[] test1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        assertEquals(6, new StringCompression().compress(test1));
        assertArrayEquals(new char[]{'a', '2', 'b', '2', 'c', '3', 'c'}, test1);

        char[] test2 = {'a'};
        assertEquals(1, new StringCompression().compress(test2));
        assertArrayEquals(new char[]{'a'}, test2);

        char[] test3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        assertEquals(4, new StringCompression().compress(test3));
        assertArrayEquals(new char[]{'a', 'b', '1', '2', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}, test3);
    }
}
