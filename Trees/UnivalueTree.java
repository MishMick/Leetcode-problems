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
    int count = 0;
    
    boolean is_uni(TreeNode node, int val){
        if(node == null) return true;
        if(!is_uni(node.left,node.val) | !is_uni(node.right, node.val))
            return false;
        count++;
        return node.val == val;
    }
   
    public int countUnivalSubtrees(TreeNode root) {
        is_uni(root,0);
        return count;
    }
}

/* Performance: 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Count Univalue Subtrees.
Memory Usage: 38.9 MB, less than 71.43% of Java online submissions for Count Univalue Subtrees.
*/