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
    public int closestValue(TreeNode root, double target) {
        int result=0;
        TreeNode curr = root;
        double prevDiff = Double.MAX_VALUE;
        while(curr != null){
            double diff = Math.abs(curr.val - target);
            if(diff < prevDiff){
                prevDiff = diff;
                result = curr.val;            
            }
            if(target < curr.val)
                curr = curr.left;
            else
                curr = curr.right;
        }
        return result;
    }
}

/* Performance: 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Closest Binary Search Tree Value.
Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Closest Binary Search Tree Value.
*/