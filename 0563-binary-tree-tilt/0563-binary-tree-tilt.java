/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int findTilt(TreeNode root) {
        
        helper(root);
        
        return sum(root);
        
    }
    
    public void helper (TreeNode root) {
        
        if (root == null) return;
        
        root.val = Math.abs(sum(root.left) - sum(root.right));
        
        helper(root.left);
        helper(root.right);
        
    }
    
    public int sum(TreeNode root) {
        
        if (root == null) {
            return 0;
        }
        
        int l = sum(root.left);
        int r = sum(root.right);
        
        return root.val + l + r;
        
    }
}