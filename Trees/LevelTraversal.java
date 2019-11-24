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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> list = new ArrayList<>();
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode current_node = queue.poll();
                list.add(current_node.val);
                if(current_node.left != null)
                    queue.add(current_node.left);
                if(current_node.right != null)
                    queue.add(current_node.right);
            }
            if(!list.isEmpty())
                result.add(new ArrayList<>(list));
            list.clear();
        }
        
        return result;
    }
}

/* Performance: 
Runtime: 1 ms, faster than 90.00% of Java online submissions for Binary Tree Level Order Traversal.
Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Binary Tree Level Order Traversal.
*/