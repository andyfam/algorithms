import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class IncreasingTripletSubsequenceTest {

    @Test
    void increasingTriplet() {
        assertTrue(new IncreasingTripletSubsequence().increasingTriplet(new int[]{1, 2, 3, 4, 5}));
        assertFalse(new IncreasingTripletSubsequence().increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        assertTrue(new IncreasingTripletSubsequence().increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
    }
}
