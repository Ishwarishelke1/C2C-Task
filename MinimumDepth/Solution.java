class Solution {
    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        // If left subtree is empty
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }

        // If right subtree is empty
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }

        // Both children exist
        return 1 + Math.min(
            minDepth(root.left),
            minDepth(root.right)
        );
    }
}