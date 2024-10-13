package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class FindTheDifferenceOfTwoArraysTest {

    @Test
    void findDifference() {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        list1.add(1);
        list1.add(3);
        list2.add(4);
        list2.add(6);

        assertIterableEquals(list, new FindTheDifferenceOfTwoArrays().findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}));

        list1.clear();
        list2.clear();
        list1.add(3);

        assertIterableEquals(list, new FindTheDifferenceOfTwoArrays().findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}));


    }
}
