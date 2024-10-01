package com.yufeng.algorithms;

import java.util.Stack;

public class ValidParentheses {
    public boolean stack(String s) {

        Stack<Character> stack = new Stack<>();
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (stack.pop() != c) {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();

    }
}
