package com.yufeng.algorithms;

import com.yufeng.algorithms.TreeTools;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InvertBinaryTreeTest {

    @Test
    void invertTree() {
        TreeNode tree1 = getTree1();

        TreeNode revert = getTree1Revert();

        assertTrue(TreeTools.isIdentical(revert, new InvertBinaryTree().invertTree(tree1)));
    }

    private TreeNode getTree1(){
        TreeNode tree1 = new TreeNode(4);
        TreeNode tree2 = new TreeNode(2);
        TreeNode tree3 = new TreeNode(7);
        TreeNode tree4 = new TreeNode(1);
        TreeNode tree5 = new TreeNode(3);
        TreeNode tree6 = new TreeNode(6);
        TreeNode tree7 = new TreeNode(9);
        tree1.left = tree2;
        tree1.right = tree3;
        tree2.left = tree4;
        tree2.right = tree5;
        tree3.left = tree6;
        tree3.right = tree7;

        return tree1;
    }

    private TreeNode getTree1Revert(){
        TreeNode tree1 = new TreeNode(4);
        TreeNode tree2 = new TreeNode(7);
        TreeNode tree3 = new TreeNode(2);
        TreeNode tree4 = new TreeNode(9);
        TreeNode tree5 = new TreeNode(6);
        TreeNode tree6 = new TreeNode(3);
        TreeNode tree7 = new TreeNode(1);
        tree1.left = tree2;
        tree1.right = tree3;
        tree2.left = tree4;
        tree2.right = tree5;
        tree3.left = tree6;
        tree3.right = tree7;

        return tree1;
    }
}
