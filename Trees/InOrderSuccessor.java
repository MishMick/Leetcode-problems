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
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root == null)
            return root;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        boolean flag = false;
        while(!stack.isEmpty() || curr != null){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            if(flag)
                return curr;
            if(curr.val == p.val){
                flag = true;
            }
            curr = curr.right;
        }
        return null;
    }
}

/* Performance: 
Runtime: 4 ms, faster than 18.86% of Java online submissions for Inorder Successor in BST.
Memory Usage: 37.6 MB, less than 5.26% of Java online submissions for Inorder Successor in BST.
*/