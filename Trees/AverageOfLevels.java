class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            long res = 0, size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                res += curr.val;
                if(curr.left != null)
                    queue.add(curr.left);
                if(curr.right != null)
                    queue.add(curr.right);
            }
            list.add(res*1.0/size);   
        }
        return list;
    }
}

/* Performance: 
Runtime: 2 ms, faster than 97.79% of Java online submissions for Average of Levels in Binary Tree.
Memory Usage: 40.4 MB, less than 88.00% of Java online submissions for Average of Levels in Binary Tree.
*/