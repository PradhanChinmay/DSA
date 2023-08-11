class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int[][] dp = new int[nums.length][nums.length + 1];
        
        for (int[] row : dp) Arrays.fill(row, -1);
        
        return helper(nums, 0, -1, dp);
        
    }
    
    
    static int helper (int[] nums, int ind, int prev, int[][] dp) {
        
        if (ind >= nums.length) return 0;
        
        if (dp[ind][prev + 1] != -1) return dp[ind][prev + 1]; 
        
        int len = 0 + helper (nums, ind + 1, prev, dp);
        
        if (prev == -1 || nums[ind] > nums[prev]) {
            
            len = Math.max(len, 1 + helper (nums, ind + 1, ind, dp));
            
        }
        
        return dp[ind][prev + 1] = len;
        
    }
}