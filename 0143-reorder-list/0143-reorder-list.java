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
    public void reorderList(ListNode head) {
        
        ListNode temp = head;
        
        while(temp.next != null) {
            
            temp.next = reverse(temp.next);
            temp = temp.next;
            
        }
        
    }
    
    public ListNode reverse (ListNode head) {
        
        ListNode curr = head, prev = null, next = null;
        
        while (curr != null) {
            
            next = curr.next;
            curr.next = prev;
            prev = curr;
            
            curr = next;
            
        }
        
        return prev;
        
    }
}