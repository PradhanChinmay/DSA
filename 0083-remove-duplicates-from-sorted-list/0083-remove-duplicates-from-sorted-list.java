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
    public ListNode deleteDuplicates(ListNode head) {
        
        if (head == null) return null;
        
        ListNode t1 = head, t2 = head.next;
        
        while (t1.next != null && t2 != null) {
            
            if (t2.next == null && t1.val == t2.val) t1.next = null;
            
            if (t1.val != t2.val) {
                
                t1.next = t2;
                t1 = t1.next;
                
            }
            t2 = t2.next;
            
        }
        
        return head;
        
    }
}