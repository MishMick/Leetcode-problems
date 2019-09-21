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
    
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        else
            return chk(root.left, root.right);
    }
    
    public boolean chk(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null)
            return true;
        if(root1 != null && root2 != null && root1.val == root2.val){
            return chk(root1.left, root2.right) && chk(root1.right, root2.left);
        }
        return false;
    }

}

/* Performance:
Runtime: 0 ms, faster than 100.00% of Java online submissions for Symmetric Tree.
Memory Usage: 38.9 MB, less than 42.18% of Java online submissions for Symmetric Tree.
*/