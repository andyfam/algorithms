package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {
    @Test
    void loop() {
        int[] nums1 = {3,0,1};

        assertEquals(2, new MissingNumber().loop(nums1));

        int[] nums2 = {0,1};
        assertEquals(2, new MissingNumber().loop(nums2));

        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        assertEquals(8, new MissingNumber().loop(nums3));
    }

    @Test
    void vector() {
        int[] nums1 = {3,0,1};

        assertEquals(2, new MissingNumber().vector(nums1));

        int[] nums2 = {0,1};
        assertEquals(2, new MissingNumber().vector(nums2));

        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        assertEquals(8, new MissingNumber().vector(nums3));
    }

    @Test
    void xor() {
        int[] nums1 = {3,0,1};

        assertEquals(2, new MissingNumber().xor(nums1));

        int[] nums2 = {0,1};
        assertEquals(2, new MissingNumber().xor(nums2));

        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        assertEquals(8, new MissingNumber().xor(nums3));
    }

    @Test
    void sum() {
        int[] nums1 = {3,0,1};

        assertEquals(2, new MissingNumber().sum(nums1));

        int[] nums2 = {0,1};
        assertEquals(2, new MissingNumber().sum(nums2));

        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        assertEquals(8, new MissingNumber().sum(nums3));
    }

    @Test
    void order() {
        int[] nums1 = {3,0,1};

        assertEquals(2, new MissingNumber().order(nums1));

        int[] nums2 = {0,1};
        assertEquals(2, new MissingNumber().order(nums2));

        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        assertEquals(8, new MissingNumber().order(nums3));
    }
}
