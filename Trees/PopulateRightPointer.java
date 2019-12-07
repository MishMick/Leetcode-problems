/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        if(root == null)
            return null;
        Queue<Node> queue = new LinkedList<>();         // for level-order traversal
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                Node curr = queue.poll();
                if(i == size-1)
                    curr.next = null;
                else
                    curr.next = queue.peek();
                if(curr.left != null)
                    queue.offer(curr.left);
                if(curr.right != null)
                    queue.offer(curr.right);
            }
        }
        return root;
    }
}

/* PerformancE:
Runtime: 2 ms, faster than 23.21% of Java online submissions for Populating Next Right Pointers in Each Node.
Memory Usage: 39.1 MB, less than 6.35% of Java online submissions for Populating Next Right Pointers in Each Node.
*/