package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    @Test
    void runBinarySearchIteratively(){
        BinarySearch binarySearch = new BinarySearch();

        int[] sortedArray = {1, 2, 3, 4, 5};
        assertEquals(2, binarySearch.runBinarySearchIteratively(sortedArray, 3));
    }
}
