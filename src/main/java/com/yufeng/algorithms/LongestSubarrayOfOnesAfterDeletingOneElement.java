package com.yufeng.algorithms;

public class LongestSubarrayOfOnesAfterDeletingOneElement {

    public int longestSubarray(int[] nums) {
        int begin = 0, end = 0, max = 0, zeros = 0;

        while (end < nums.length) {
            if (nums[end] == 0) {
                zeros++;
            }
            end++;

            if (zeros > 1) {
                if (nums[begin] == 0) {
                    zeros--;
                }
                begin++;
            }

            max = Math.max(max, end - begin - 1);
        }

        return max;
    }
}
