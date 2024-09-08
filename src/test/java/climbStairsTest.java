import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class climbStairsTest {
    @Test
    void climbStairs() {
        assertEquals(2, new ClimbingStairs().climbStairs(2));
        assertEquals(3, new ClimbingStairs().climbStairs(3));
        assertEquals(5, new ClimbingStairs().climbStairs(4));
    }

    @Test
    void iterate() {
        assertEquals(2, new ClimbingStairs().iterate(2));
        assertEquals(3, new ClimbingStairs().iterate(3));
        assertEquals(5, new ClimbingStairs().iterate(4));
    }

    @Test
    void iterateByTwoNums() {
        assertEquals(2, new ClimbingStairs().iterateByTwoNums(2));
        assertEquals(3, new ClimbingStairs().iterateByTwoNums(3));
        assertEquals(5, new ClimbingStairs().iterateByTwoNums(4));
    }
}
