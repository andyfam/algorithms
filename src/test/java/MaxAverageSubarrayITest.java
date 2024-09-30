import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxAverageSubarrayITest {
    @Test
    void findMaxAverage() {
        assertEquals(12.75000, new MaxAverageSubarrayI().findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
        assertEquals(5.00000, new MaxAverageSubarrayI().findMaxAverage(new int[]{5}, 1));
        assertEquals(4.00000, new MaxAverageSubarrayI().findMaxAverage(new int[]{0, 4, 0, 3, 2}, 1));
        assertEquals(6.20000, new MaxAverageSubarrayI().findMaxAverage(new int[]{8,0,1,7,8,6,5,5,6,7}, 5));
    }
}
