/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if (head == null || head.next == null) return true;
        
        ListNode f = head.next, s = head;
        
        while (f != null && f.next != null) {
            
            f = f.next.next;
            s = s.next;
            
        }
        
        ListNode mid = s.next;
        
        ListNode prev = null, next = null, curr = mid;
        
        while (curr != null) {
            
            next = curr.next;
            curr.next = prev;
            prev = curr;
            
            curr = next;
            
        }
        
        while (prev != null) {
            
            if (head.val != prev.val) return false;
            
            prev = prev.next;
            head = head.next;
            
        }
        
        return true;
        
    }
}