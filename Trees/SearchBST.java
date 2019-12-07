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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return null;
        TreeNode curr = root;
        while(curr != null){
            if(curr.val == val)
                return curr;
            if(val < curr.val)
                curr = curr.left;
            else
                curr = curr.right;
        }
        return null;
    }
}

/* Performance: 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
Memory Usage: 37.8 MB, less than 100.00% of Java online submissions for Search in a Binary Search Tree.
*/