package com.yufeng.algorithms;

import java.util.Stack;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        Stack<Character> stack = new Stack();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (StringTools.isVowel(chars[i])) {
                stack.push(chars[i]);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (StringTools.isVowel(chars[i])) {
                chars[i] = stack.pop();
            }
        }

        return String.valueOf(chars);
    }

    public String twoPointers(String s) {
        char[] chars = s.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            while (start < end && !StringTools.isVowel((chars[start]))) {
                start++;
            }

            while (start < end && !StringTools.isVowel((chars[end]))) {
                end--;
            }

            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;

            start++;
            end--;
        }

        return String.valueOf(chars);
    }
}
