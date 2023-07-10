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
    public ListNode sortList(ListNode head) {
        
        if (head == null || head.next == null) return head;
        
        ListNode mid = findMid(head);
        
        ListNode left = head;
        ListNode right = mid.next;
        
        mid.next = null;
        
        left = sortList(left);
        right = sortList(right);
        
        ListNode res = merge(left, right);
        
        return res;
        
    }
    
    public ListNode findMid(ListNode head) {
        
        ListNode f = head.next, s = head;
        
        while (f != null && f.next != null) {
            
            f = f.next.next;
            s = s.next;
            
        }
        
        return s;
        
    }
    
    public ListNode merge(ListNode left, ListNode right) {
        
        ListNode ansHead = null, tail = null;
        
        while (left != null && right != null) {
            
            if (left.val <= right.val) {
                
                if (ansHead == null) {
                    ansHead = left;
                    tail = left;
                }
                else {
                    tail.next = left;
                    tail = tail.next;
                }
                
                left = left.next;
                
            }
            else {
                
                if (ansHead == null) {
                    ansHead = right;
                    tail = right;
                }
                else {
                    tail.next = right;
                    tail = tail.next;
                }
                
                right = right.next;
                
            }
            
        }
        
        while (left != null) {
            
            tail.next = left;
            left = left.next;
            
            tail = tail.next;
            
        }
        
        while (right != null) {
            
            tail.next = right;
            right = right.next;
            
            tail = tail.next;
            
        }
        
        return ansHead;
        
    }
}