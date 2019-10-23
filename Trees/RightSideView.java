import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        if(root == null) return result;
        
        queue.add(root);
        while(queue.size() != 0){
            int size = queue.size();
            for(int i=0;i<size;i++){
                //System.out.println("Size on this lvl: "+size);
                //System.out.println("indx: "+i);
                TreeNode current = queue.remove();
                //System.out.println("Current: "+current.val);
                if(i == (size-1)){
                    //System.out.println("Adding: "+current.val);
                    result.add(current.val);
                }
                if(current.left != null)
                    queue.add(current.left);
                if(current.right != null)
                    queue.add(current.right);
            }
        }
        return result;
    }
}

/* Performance: 
Runtime: 1 ms, faster than 100.00% of Java online submissions for Binary Tree Right Side View.
Memory Usage: 35.5 MB, less than 100.00% of Java online submissions for Binary Tree Right Side View.
*/