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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p == null || q == null)
            return false;
        return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
    }
}

/* Performance: 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Same Tree.
Memory Usage: 34.3 MB, less than 100.00% of Java online submissions for Same Tree.
*/