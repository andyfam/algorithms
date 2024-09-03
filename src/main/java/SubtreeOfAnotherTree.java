import java.util.Stack;

public class SubtreeOfAnotherTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (isIdentical(root, subRoot)) {
            return true;
        }

        if (root.left != null) {
            if (isSubtree(root.left, subRoot)) {
                return true;
            }
        }

        if (root.right != null) {
            if (isSubtree(root.right, subRoot)) {
                return true;
            }
        }

        return false;
    }

    public boolean iterative(TreeNode root, TreeNode subRoot) {
        Stack<TreeNode> nodes = new Stack<TreeNode>();
        nodes.push(root);
        TreeNode node;
        while (!nodes.isEmpty()) {
            node = nodes.pop();
            if (isIdentical(node, subRoot)) {
                return true;
            }
            if (node.left != null) nodes.push(node.left);
            if (node.right != null) nodes.push(node.right);

        }

        return false;
    }

    private boolean isIdentical(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }

        if (t1 != null && t2 != null) {
            if (t1.val != t2.val) {
                return false;
            }

            if (!isIdentical(t1.left, t2.left)) {
                return false;
            }

            if (!isIdentical(t1.right, t2.right)) {
                return false;
            }

            return true;
        }


        return false;

    }
}
