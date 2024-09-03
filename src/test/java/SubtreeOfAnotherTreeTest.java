import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SubtreeOfAnotherTreeTest {
    @Test
    void isSubtree() {

        SubtreeOfAnotherTree.TreeNode tree1 = getTree();

        SubtreeOfAnotherTree.TreeNode subTree1 = getSubTree();

        assertTrue(new SubtreeOfAnotherTree().isSubtree(tree1, subTree1));

        SubtreeOfAnotherTree.TreeNode tree6 = new SubtreeOfAnotherTree.TreeNode(0);
        tree1.left.right.left = tree6;

        assertFalse(new SubtreeOfAnotherTree().isSubtree(tree1, subTree1));
    }

    @Test
    void iterative() {
        SubtreeOfAnotherTree.TreeNode tree1 = getTree();

        SubtreeOfAnotherTree.TreeNode subTree1 = getSubTree();

        assertTrue(new SubtreeOfAnotherTree().iterative(tree1, subTree1));

        SubtreeOfAnotherTree.TreeNode tree6 = new SubtreeOfAnotherTree.TreeNode(0);
        tree1.left.right.left = tree6;

        assertFalse(new SubtreeOfAnotherTree().iterative(tree1, subTree1));
    }

    private SubtreeOfAnotherTree.TreeNode getTree(){
        SubtreeOfAnotherTree.TreeNode tree1 = new SubtreeOfAnotherTree.TreeNode(3);
        SubtreeOfAnotherTree.TreeNode tree2 = new SubtreeOfAnotherTree.TreeNode(4);
        SubtreeOfAnotherTree.TreeNode tree3 = new SubtreeOfAnotherTree.TreeNode(5);
        SubtreeOfAnotherTree.TreeNode tree4 = new SubtreeOfAnotherTree.TreeNode(1);
        SubtreeOfAnotherTree.TreeNode tree5 = new SubtreeOfAnotherTree.TreeNode(2);
        tree1.left = tree2;
        tree1.right = tree3;
        tree2.left = tree4;
        tree2.right = tree5;

        return tree1;
    }

    private SubtreeOfAnotherTree.TreeNode getSubTree(){
        SubtreeOfAnotherTree.TreeNode subTree1 = new SubtreeOfAnotherTree.TreeNode(4);
        SubtreeOfAnotherTree.TreeNode subTree2 = new SubtreeOfAnotherTree.TreeNode(1);
        SubtreeOfAnotherTree.TreeNode subTree3 = new SubtreeOfAnotherTree.TreeNode(2);
        subTree1.left = subTree2;
        subTree1.right = subTree3;

        return subTree1;
    }
}
