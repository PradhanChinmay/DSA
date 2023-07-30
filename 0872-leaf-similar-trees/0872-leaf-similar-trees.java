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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        
        helper (root1, a1);
        helper (root2, a2);
        
        // System.out.println(a1);
        // System.out.println(a2);
        
        if (a1.size() != a2.size()) return false;
        
        for (int i = 0; i <= a1.size() - 1; i++) if (a1.get(i) != a2.get(i)) return false;
        
        return true;
        
    }
    
    public void helper (TreeNode root, List<Integer> al) {
        
        if (root == null)  return;
        
        if (root.left == null && root.right == null) {
            
            al.add(root.val);
            
        }
        
        helper (root.left, al);
        helper (root.right, al);
        
        return;
        
    }
}