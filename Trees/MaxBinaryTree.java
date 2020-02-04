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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructLevels(nums,0,nums.length);
    }
    public TreeNode constructLevels(int[] input,int left, int right){
        if(left == right)
            return null;
        int maxIndx = left;
        for(int x=left; x<right; x++){
            if(input[x] > input[maxIndx]){
                maxIndx = x;
            }
        }
        TreeNode root = new TreeNode(input[maxIndx]);
        root.left = constructLevels(input,left,maxIndx);
        root.right = constructLevels(input, maxIndx+1, right);
        return root;
    }
   
}

/* Performance: 
Runtime: 2 ms, faster than 99.13% of Java online submissions for Maximum Binary Tree.
Memory Usage: 42 MB, less than 6.52% of Java online submissions for Maximum Binary Tree.
*/