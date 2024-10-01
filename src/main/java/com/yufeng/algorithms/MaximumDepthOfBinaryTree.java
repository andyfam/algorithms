package com.yufeng.algorithms;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        int result = 0;
        if (root == null) {
            return result;
        }

        result = 1;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        result += left > right ? left : right;

        return result;
    }
}
