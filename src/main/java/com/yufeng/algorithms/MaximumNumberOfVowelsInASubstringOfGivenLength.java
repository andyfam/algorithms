package com.yufeng.algorithms;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    public int maxVowels(String s, int k) {
        char[] chars = s.toCharArray();
        int max = 0;
        for (int i = 0; i < k; i++) {
            if (StringTools.isVowel(chars[i])) {
                max++;
            }
        }

        if (chars.length > k) {
            int tmp = max;
            for (int i = 1; i < chars.length - k + 1; i++) {
                if (StringTools.isVowel((chars[i - 1]))) {
                    tmp--;
                }
                if (StringTools.isVowel((chars[i + k - 1]))) {
                    tmp++;
                }
                if (tmp > max) {
                    max = tmp;
                }
            }
        }

        return max;
    }

    public int maxVowels2(String s, int k) {
        int max = 0;
        int numsInTheWindow = 0, tmp = 0;

        for (int i = 0; i < s.length(); i++) {
            numsInTheWindow += StringTools.isVowel(s.charAt(i)) ? 1 : 0;
            if (i >= k - 1) {
                max = Math.max(max, numsInTheWindow);
                if (StringTools.isVowel(s.charAt(tmp++))) numsInTheWindow--;
            }
        }

        return max;
    }
}
