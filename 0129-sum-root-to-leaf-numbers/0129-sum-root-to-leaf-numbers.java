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
    public int sumNumbers(TreeNode root) {
        
        ArrayList<String> al = new ArrayList<>();
        
        helper(root, "", al);
        
        int ans = 0;
        
        for (String s : al) {
            
            ans = ans + Integer.parseInt(s);
            
        }
        
        return ans;
        
    }
    
    public static void helper (TreeNode root, String s, ArrayList<String> al) {
        
        if (root == null) return;
        
        if (root.left == null && root.right == null) {
            al.add(s + root.val);
            return;
        }
        
        helper(root.left, s + root.val, al);
        helper(root.right, s + root.val, al);
        
    }
}