import java.util.Stack;

public class SubtreeOfAnotherTree {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (TreeTools.isIdentical(root, subRoot)) {
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
            if (TreeTools.isIdentical(node, subRoot)) {
                return true;
            }
            if (node.left != null) nodes.push(node.left);
            if (node.right != null) nodes.push(node.right);

        }

        return false;
    }

}
