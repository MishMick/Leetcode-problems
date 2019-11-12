/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
             return null;
        
        Map<Node, Node> cloneMap = new HashMap<Node, Node>();
        Node curr = head;
        while(curr != null){
            cloneMap.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        
        curr = head;
        while(curr != null){
            cloneMap.get(curr).next = cloneMap.get(curr.next);
            cloneMap.get(curr).random = cloneMap.get(curr.random);
            curr = curr.next;
        }
        
        return cloneMap.get(head);
    }
}

/* Performance :
Runtime: 1 ms, faster than 74.48% of Java online submissions for Copy List with Random Pointer.
Memory Usage: 33.7 MB, less than 99.07% of Java online submissions for Copy List with Random Pointer.
*/