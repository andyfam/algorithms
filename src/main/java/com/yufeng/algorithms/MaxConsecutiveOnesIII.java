package com.yufeng.algorithms;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int begin = 0, end = 0, max = 0, zeros = 0;

        while (end < nums.length) {
            if(nums[end] == 0){
                zeros++;
            }
            end++;

            if (zeros > k) {
                if(nums[begin] == 0){
                    zeros--;
                }
                begin++;
            }

            max = Math.max(max, end - begin);
        }

        return max;
    }
}
