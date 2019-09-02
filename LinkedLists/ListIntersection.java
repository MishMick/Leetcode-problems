// Write a program to find the node at which the intersection of two singly linked lists begins.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public int findLength(ListNode head){
        int len = 0;
        ListNode current = head;
        while(current != null){
            len++;
            current = current.next;
        }
        return len;
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = findLength(headA);
        int lenB = findLength(headB);
        int diff = lenA - lenB;
        if(diff == 0 && headA == headB) return headA;
        while(diff != 0){
            if(diff > 0) // lenA > lenB
            {
                headA = headA.next;
                diff = diff - 1;
            }else{
                headB = headB.next;
                diff = diff + 1;
            }
        }
        while(headA != null && headB != null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}

/* Performance: 
Runtime: 1 ms, faster than 98.72% of Java online submissions for Intersection of Two Linked Lists.
Memory Usage: 38.6 MB, less than 50.00% of Java online submissions for Intersection of Two Linked Lists.
*/