package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheHighestAltitudeTest {

    @Test
    void largestAltitude() {
        assertEquals(1, new FindTheHighestAltitude().largestAltitude(new int[]{-5,1,5,0,-7}));
        assertEquals(0, new FindTheHighestAltitude().largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }
}
