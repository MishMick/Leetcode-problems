// Given a singly linked list, determine if it is a palindrome.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        // Base case
        if(head == null || head.next == null) return true;
        // Find the midpoint
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode mid = slow;
        // Reverse list from slow->next;
        ListNode reversedList = this.reverseList(slow.next);
        //step3.iterate both half
        ListNode p = head;
        ListNode q = reversedList;
        while(p != null && q != null){
            if(p.val != q.val)
                return false;
            else{
                p = p.next;
                q = q.next;
            }
        }
        return true;
    }
    
}

/* Performance: 
Runtime: 1 ms, faster than 99.07% of Java online submissions for Palindrome Linked List.
Memory Usage: 39.9 MB, less than 98.78% of Java online submissions for Palindrome Linked List.
*/