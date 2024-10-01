package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SameTreeTest {
    @Test
    void isSameTree() {
        TreeNode p = getTree1();
        TreeNode q = getTree1();
        assertTrue(new SameTree().isSameTree(p, q));

        TreeNode tree1 = new TreeNode(1);
        TreeNode tree1_2 = new TreeNode(2);
        tree1.left = tree1_2;

        TreeNode tree2 = new TreeNode(1);
        TreeNode tree2_2 = new TreeNode(2);
        tree2.right = tree2_2;
        assertFalse(new SameTree().isSameTree(tree1, tree2));

        TreeNode t1 = new TreeNode(1);
        TreeNode t1_2 = new TreeNode(2);
        TreeNode t1_3 = new TreeNode(1);
        t1.left = t1_2;
        t1.right = t1_3;

        TreeNode t2 = new TreeNode(1);
        TreeNode t2_2 = new TreeNode(1);
        TreeNode t2_3 = new TreeNode(2);
        t2.left = t2_2;
        t2.right = t2_3;
        assertFalse(new SameTree().isSameTree(t1, t2));
    }

    private TreeNode getTree1() {
        TreeNode tree1 = new TreeNode(1);
        TreeNode tree2 = new TreeNode(2);
        TreeNode tree3 = new TreeNode(3);
        tree1.left = tree2;
        tree1.right = tree3;

        return tree1;
    }
}
