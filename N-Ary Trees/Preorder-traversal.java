/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if(root == null)
            return result;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            Node current = stack.pop();
            result.add(current.val);
            for(int i=current.children.size()-1; i >= 0; i--)
                stack.push(current.children.get(i));
        }
        
        return result;
    }
}

/* Performance: 
Runtime: 3 ms, faster than 34.84% of Java online submissions for N-ary Tree Preorder Traversal.
Memory Usage: 40 MB, less than 100.00% of Java online submissions for N-ary Tree Preorder Traversal.
*/