public class TreeTools {
    public static boolean isIdentical(TreeNode t1, TreeNode t2) {
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
