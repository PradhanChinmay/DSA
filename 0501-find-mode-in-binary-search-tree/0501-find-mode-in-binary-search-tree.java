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
    Integer prev = null;
    int count = 1;
    int max = 0;
    public int[] findMode(TreeNode root) {
        
        List<Integer> modes = new ArrayList<>();
        
        helper(root, modes);
        
        int[] res = new int[modes.size()];
        for (int i = 0; i <= res.length - 1; i++) res[i] = modes.get(i);
        
        return res;
        
    }

    public void helper (TreeNode root, List<Integer> modes) {
        
        if (root == null) return;
        
        helper (root.left, modes);
        
        if (prev != null) {
            
            if (prev == root.val) count++;
            else count = 1;
            
        }
        
        prev = root.val;
        
        if (count > max) {
            max = count;
            modes.clear();
            modes.add(root.val);
        }
        else if (count == max) {
            modes.add(root.val);
        }
        
        helper (root.right, modes);
        
    }
}