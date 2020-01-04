/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode root = head;
        
        /* 
            1->2->3->4
            root
            1 -> 3 ( 3 != null)
            1 -> root.val
            2 -> root.next.val
            2->1->3->4
                root
            1 -> 4( 4!= null)
            3 -> root.val
            4 -> root.next.val
            2->1->4->3
        */
        
        while(root != null){
            if(root.next == null)
                return head;
            // swap 
            int temp = root.next.val;
            root.next.val = root.val;
            root.val = temp;
            // skip one node
            root = root.next.next;
        }
        
        return head;
    }
}

/* Performance: 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Swap Nodes in Pairs.
Memory Usage: 34.5 MB, less than 100.00% of Java online submissions for Swap Nodes in Pairs.
*/