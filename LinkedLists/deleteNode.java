// Write a function to delete a node (except the tail) in a singly linked list, given only access to that node

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

/*
 * Performance : Runtime: 0 ms, faster than 100.00% of Java online submissions
 * for Delete Node in a Linked List. Memory Usage: 36.5 MB, less than 100.00% of
 * Java online submissions for Delete Node in a Linked List.
 */