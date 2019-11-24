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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        
        Stack<TreeNode> s1 = new Stack<TreeNode>();     // L->R
        Stack<TreeNode> s2 = new Stack<TreeNode>();     // R->L

        s1.push(root);
        List<Integer> list = new ArrayList<>();
        while(!s1.isEmpty() || !s2.isEmpty()){
            while(!s1.isEmpty()){
                TreeNode current = s1.pop();
                list.add(current.val);
                if(current.left != null){
                    s2.push(current.left);
                }
                if(current.right != null){
                    s2.push(current.right);
                }
            }
            if(!list.isEmpty())
                result.add(new ArrayList<>(list));
            list.clear();
            while(!s2.isEmpty()){
                TreeNode current = s2.pop();
                list.add(current.val);
                if(current.right != null){
                    s1.push(current.right);
                }
                if(current.left != null){
                    s1.push(current.left);
                }
            }
            if(!list.isEmpty())
                result.add(new ArrayList<>(list));
            list.clear();
        }
        return result;
    }
}

/* Performance : 
Runtime: 1 ms, faster than 94.15% of Java online submissions for Binary Tree Zigzag Level Order Traversal.
Memory Usage: 36.4 MB, less than 99.04% of Java online submissions for Binary Tree Zigzag Level Order Traversal.
*/