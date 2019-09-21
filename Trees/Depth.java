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
    public int maxDepth(TreeNode root) {
        int result=0;
        if(root == null)
            return 0;
        else{
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);
            result = lDepth > rDepth ? lDepth : rDepth ;
            return result + 1;
        }
    }
}

/* Performance: 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
Memory Usage: 38.6 MB, less than 95.70% of Java online submissions for Maximum Depth of Binary Tree.
*/