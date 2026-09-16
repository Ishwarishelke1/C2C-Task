class Solution {
    
    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        // Store inorder value -> index
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        
        return build(preorder, 0, inorder.length - 1, map);
    }

    private TreeNode build(int[] preorder, int left, int right,
                           java.util.HashMap<Integer, Integer> map) {
        
        // No elements
        if (left > right) {
            return null;
        }

        // First preorder element is root
        int rootValue = preorder[preIndex++];
        
        TreeNode root = new TreeNode(rootValue);

        // Find root position in inorder
        int rootIndex = map.get(rootValue);

        // Build left subtree
        root.left = build(preorder, left, rootIndex - 1, map);

        // Build right subtree
        root.right = build(preorder, rootIndex + 1, right, map);

        return root;
    }
}