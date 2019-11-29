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

    public boolean chkSubTree(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        return root1.val == root2.val && chkSubTree(root1.left, root2.left) && chkSubTree(root1.right, root2.right);
        
    }
    
    public boolean isSubtree(TreeNode s, TreeNode t) {
        
        if(s == null)
            return false;
        if(t == null)
            return false;
        if(chkSubTree(s,t))
            return true;
        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }
}

/*
Runtime: 6 ms, faster than 90.17% of Java online submissions for Subtree of Another Tree.
Memory Usage: 39.9 MB, less than 97.78% of Java online submissions for Subtree of Another Tree.
*/