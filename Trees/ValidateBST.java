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
    public boolean validateBST(TreeNode root, Integer min, Integer max){
         if(root == null)
            return true;
        if((min != null && root.val <= min) || (max != null && root.val >= max))
            return false;
        else
            return validateBST(root.left, min, root.val) && validateBST(root.right, root.val, max);
    }
    public boolean isValidBST(TreeNode root) {
        return validateBST(root, null, null);
    }
}

/* Performance: 
Runtime: 35 ms, faster than 7.29% of Java online submissions for Validate Binary Search Tree.
Memory Usage: 40 MB, less than 65.12% of Java online submissions for Validate Binary Search Tree.
*/