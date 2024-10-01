package com.yufeng.algorithms;

import java.util.*;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        boolean result = false;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                result = true;
                break;
            }
            set.add(nums[i]);
        }

        return result;
    }

    public boolean sort(int[] nums) {
        boolean result = false;

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return result;
    }
}
