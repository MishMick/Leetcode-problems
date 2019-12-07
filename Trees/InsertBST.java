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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null)
            return null;
        TreeNode curr = root;
        while(curr != null){
            if(val > curr.val){
                if(curr.right == null){
                    curr.right = new TreeNode(val);
                    return root;
                }
                curr = curr.right;
            }else{
                if(curr.left == null){
                    curr.left = new TreeNode(val);
                    return root;
                }
                curr = curr.left;
            }
        }
        return null;
    }
}

/* Performance: 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Insert into a Binary Search Tree.
Memory Usage: 38.4 MB, less than 100.00% of Java online submissions for Insert into a Binary Search Tree.
*/