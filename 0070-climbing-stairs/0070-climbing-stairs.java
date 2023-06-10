class Solution {
    
    public int climbStairs(int n) {
        
        int[] dp = new int[n + 1];
        
        for (int i = 0; i <= n; i++) dp[i] = -1;
        
        helper (n, dp);
        
        return dp[n];
        
    }
    
    private static int helper (int n, int[] dp) {
        
        if (n == 0) return 1;
        
        if (dp[n] != -1) return dp[n];
        
        int left = helper (n - 1, dp);
        int right = n >= 2 ? helper (n - 2, dp) : 0;
        
        return dp[n] = left + right;
        
    }
    
}