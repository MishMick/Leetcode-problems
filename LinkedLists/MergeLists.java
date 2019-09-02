// Merge two sorted linked lists and return it as a new list. 

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode virtualHead = new ListNode(-1);
        ListNode head = virtualHead;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                virtualHead.next = l1;
                l1 = l1.next;
            }else{
                virtualHead.next = l2;
                l2 = l2.next;
            }
            virtualHead = virtualHead.next;
        }
        
        if(l1 != null){
            virtualHead.next = l1;
        }else{
            virtualHead.next = l2;
        }
        
        return head.next;
    }
}

/* Performance: 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
Memory Usage: 40.6 MB, less than 13.13% of Java online submissions for Merge Two Sorted Lists.
*/