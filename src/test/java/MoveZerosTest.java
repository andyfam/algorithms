import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZerosTest {
    @Test
    void moveZeroes() {
        int[] arr1 = {0, 1, 0, 3, 12};
        new MoveZeros().moveZeroes(arr1);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, arr1);

        int[] arr2 = {0};
        new MoveZeros().moveZeroes(arr2);
        assertArrayEquals(new int[]{0}, arr2);

        int[] arr3 = {1, 0};
        new MoveZeros().moveZeroes(arr3);
        assertArrayEquals(new int[]{1, 0}, arr3);
    }

    @Test
    void moveNonZeroes() {
        int[] arr1 = {0, 1, 0, 3, 12};
        new MoveZeros().moveNonZeroes(arr1);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, arr1);

        int[] arr2 = {0};
        new MoveZeros().moveNonZeroes(arr2);
        assertArrayEquals(new int[]{0}, arr2);

        int[] arr3 = {1, 0};
        new MoveZeros().moveNonZeroes(arr3);
        assertArrayEquals(new int[]{1, 0}, arr3);
    }

    @Test
    void replace() {
        int[] arr1 = {0, 1, 0, 3, 12};
        new MoveZeros().replace(arr1);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, arr1);

        int[] arr2 = {0};
        new MoveZeros().replace(arr2);
        assertArrayEquals(new int[]{0}, arr2);

        int[] arr3 = {1, 0};
        new MoveZeros().replace(arr3);
        assertArrayEquals(new int[]{1, 0}, arr3);
    }
}
