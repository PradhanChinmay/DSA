/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode next_node = node.next;
        
        node.val = next_node.val;
        
        node.next = next_node.next;
        
        next_node.next = null;
        
    }
}