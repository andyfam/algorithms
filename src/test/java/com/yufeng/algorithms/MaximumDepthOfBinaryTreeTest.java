package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDepthOfBinaryTreeTest {

    @Test
    void maxDepth() {
        TreeNode tree1 = new TreeNode(3);
        TreeNode tree2 = new TreeNode(9);
        TreeNode tree3 = new TreeNode(20);
        TreeNode tree4 = new TreeNode(15);
        TreeNode tree5 = new TreeNode(7);
        tree1.left = tree2;
        tree1.right = tree3;
        tree3.left = tree4;
        tree3.right = tree5;

        assertEquals(3, new MaximumDepthOfBinaryTree().maxDepth(tree1));

        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        t1.right = t2;

        assertEquals(2, new MaximumDepthOfBinaryTree().maxDepth(t1));
    }
}
