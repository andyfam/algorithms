package com.yufeng.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberofCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> results = new ArrayList<>();

        int largest = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > largest) {
                largest = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= largest) {
                results.add(true);
            } else {
                results.add(false);
            }
        }

        return results;

    }
}
