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
    
    public boolean isLeaf(TreeNode t){
        return t.left == null && t.right == null;
    }
    
    public void addLeaves(List<Integer> result, TreeNode root){
        if(isLeaf(root))
            result.add(root.val);
        else{
            if(root.left != null){
                addLeaves(result, root.left);
            }
            if(root.right != null){
                addLeaves(result, root.right);
            }
        }
    }
    
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> result = new ArrayList<>();
       
        if(root == null)
            return result;
        
        if(!isLeaf(root)){
            result.add(root.val);
        }
        
        TreeNode curr = root.left;
        while(curr != null){
            if(!isLeaf(curr))
                result.add(curr.val);
            if(curr.left != null)
                curr = curr.left;
            else
                curr = curr.right;
        }
        
        addLeaves(result,root);
        
        Stack<Integer> stack = new Stack<>();
        curr = root.right;
        
        while(curr != null){
            if(!isLeaf(curr))
                stack.push(curr.val);
            if(curr.right != null)
                curr = curr.right;
            else
                curr = curr.left;
        }
        while(!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
    }
}

/* Performance: 
Runtime: 2 ms, faster than 35.88% of Java online submissions for Boundary of Binary Tree.
Memory Usage: 37.3 MB, less than 100.00% of Java online submissions for Boundary of Binary Tree.
*/