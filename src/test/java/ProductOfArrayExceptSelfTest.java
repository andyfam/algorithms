import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductOfArrayExceptSelfTest {
    @Test
    void productExceptSelf() {
        assertArrayEquals(new int[]{24,12,8,6}, new ProductOfArrayExceptSelf().productExceptSelf(new int[]{1,2,3,4}));
        assertArrayEquals(new int[]{0,0,9,0,0}, new ProductOfArrayExceptSelf().productExceptSelf(new int[]{-1,1,0,-3,3}));
    }

    @Test
    void divideBySelf() {
        assertArrayEquals(new int[]{24,12,8,6}, new ProductOfArrayExceptSelf().divideBySelf(new int[]{1,2,3,4}));
        assertArrayEquals(new int[]{0,0,9,0,0}, new ProductOfArrayExceptSelf().divideBySelf(new int[]{-1,1,0,-3,3}));
    }

    @Test
    void prefixAndSuffix() {
        assertArrayEquals(new int[]{24,12,8,6}, new ProductOfArrayExceptSelf().prefixAndSuffix(new int[]{1,2,3,4}));
        assertArrayEquals(new int[]{0,0,9,0,0}, new ProductOfArrayExceptSelf().prefixAndSuffix(new int[]{-1,1,0,-3,3}));
    }

    @Test
    void prefixAndSuffixWithOneArray() {
        assertArrayEquals(new int[]{24,12,8,6}, new ProductOfArrayExceptSelf().prefixAndSuffixWithOneArray(new int[]{1,2,3,4}));
        assertArrayEquals(new int[]{0,0,9,0,0}, new ProductOfArrayExceptSelf().prefixAndSuffixWithOneArray(new int[]{-1,1,0,-3,3}));
    }
}
