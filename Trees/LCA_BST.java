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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        
        if(p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right,p,q);
        else if(p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left,p,q);
        else
            return root;
    }
}

/* Performance: 
Runtime: 4 ms, faster than 100.00% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
Memory Usage: 35.9 MB, less than 5.10% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
*/