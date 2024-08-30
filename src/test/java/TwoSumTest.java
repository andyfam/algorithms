import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumTest {

    @Test
    void bruteForce(){
        int[] nums = {3,2,4};
        int target = 6;

        int[] result = new TwoSum().bruteForce(nums, target);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    void hashTable(){
        int[] nums = {3,2,4};
        int target = 6;

        int[] result = new TwoSum().hashTable(nums, target);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }
}
