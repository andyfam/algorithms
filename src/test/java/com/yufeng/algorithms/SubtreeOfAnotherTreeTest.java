package com.yufeng.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SubtreeOfAnotherTreeTest {
    @Test
    void isSubtree() {

        TreeNode tree1 = getTree();

        TreeNode subTree1 = getSubTree();

        assertTrue(new SubtreeOfAnotherTree().isSubtree(tree1, subTree1));

        TreeNode tree6 = new TreeNode(0);
        tree1.left.right.left = tree6;

        assertFalse(new SubtreeOfAnotherTree().isSubtree(tree1, subTree1));
    }

    @Test
    void iterative() {
        TreeNode tree1 = getTree();

        TreeNode subTree1 = getSubTree();

        assertTrue(new SubtreeOfAnotherTree().iterative(tree1, subTree1));

        TreeNode tree6 = new TreeNode(0);
        tree1.left.right.left = tree6;

        assertFalse(new SubtreeOfAnotherTree().iterative(tree1, subTree1));
    }

    private TreeNode getTree(){
        TreeNode tree1 = new TreeNode(3);
        TreeNode tree2 = new TreeNode(4);
        TreeNode tree3 = new TreeNode(5);
        TreeNode tree4 = new TreeNode(1);
        TreeNode tree5 = new TreeNode(2);
        tree1.left = tree2;
        tree1.right = tree3;
        tree2.left = tree4;
        tree2.right = tree5;

        return tree1;
    }

    private TreeNode getSubTree(){
        TreeNode subTree1 = new TreeNode(4);
        TreeNode subTree2 = new TreeNode(1);
        TreeNode subTree3 = new TreeNode(2);
        subTree1.left = subTree2;
        subTree1.right = subTree3;

        return subTree1;
    }
}
