/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        // iterate up-down
        // swap root.left and root.right
        // swap root1.left <-> root2.right | root1.right <-> root2.left
        if ( root == null ) 
            return null;
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
    
}

/* 
Performance: 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
Memory Usage: 34.3 MB, less than 100.00% of Java online submissions for Invert Binary Tree.
*/