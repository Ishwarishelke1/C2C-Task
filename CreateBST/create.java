public class create {

    // TreeNode class
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Convert sorted array to BST
    public static TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length - 1);
    }

    // Recursive function
    public static TreeNode createBST(int[] nums, int left, int right) {

        // Base case
        if (left > right) {
            return null;
        }

        // Find middle
        int mid = left + (right - left) / 2;

        // Create root
        TreeNode root = new TreeNode(nums[mid]);

        // Create left subtree
        root.left = createBST(nums, left, mid - 1);

        // Create right subtree
        root.right = createBST(nums, mid + 1, right);

        return root;
    }

    // Inorder traversal
    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // Main function
    public static void main(String[] args) {

        int[] nums = {-10, -3, 0, 5, 9};

        TreeNode root = sortedArrayToBST(nums);

        System.out.println("Inorder Traversal:");
        inorder(root);
    }
}